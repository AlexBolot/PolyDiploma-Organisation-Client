package fr.polytech.polydiploma.features;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.arquillian.ArquillianCucumber;
import cucumber.runtime.arquillian.testng.CukeSpace;
import fr.polytech.polydiploma.GraduateBean;
import fr.polytech.polydiploma.ManageParticipants;
import fr.polytech.polydiploma.arquillian.AbstractArquillianTest;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;
import fr.polytech.polydiploma.webservice.OrganisationWebServiceImpl;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.assertFalse;

@RunWith(ArquillianCucumber.class)
@CucumberOptions(features = "src/test/resources")
public class InviteGraduates extends AbstractArquillianTest {

    private OrganisationWebServiceImpl owsi = new OrganisationWebServiceImpl();
    @EJB
    private GraduateBean graduateBean;
    @EJB
    private ManageParticipants manageParticipants;

    @Given("a list of students who validate their diploma")
    public void initStudentsList() {
        try {
            owsi.inviteGraduates();
        } catch (ExternalPartnerException e) {
            e.printStackTrace();
        }
    }

    @Then("the list of participants is not empty")
    public void checkEmptiness() {
        assertFalse(manageParticipants.requireParticipants().isEmpty());
    }


}
