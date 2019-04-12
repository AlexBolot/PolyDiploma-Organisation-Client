package fr.polytech.polydiploma.arquillian;

import fr.polytech.polydiploma.GraduateBean;
import fr.polytech.polydiploma.PlanningUpdater;
import fr.polytech.polydiploma.component.PlanCeremonyBean;
import fr.polytech.polydiploma.entities.Planning;
import fr.polytech.polydiploma.exceptions.TimeslotOverlapException;
import fr.polytech.polydiploma.interceptor.ExpectedVerifier;
import fr.polytech.polydiploma.utils.MailAPI;
import fr.polytech.polydiploma.webservice.OrganisationWebServiceImpl;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import javax.ejb.EJB;

public abstract class AbstractArquillianTest {

    @Deployment
    public static WebArchive createDeployment() {
        // Building a Web ARchive (WAR) containing the following elements:
        return ShrinkWrap.create(WebArchive.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                .addPackage(GraduateBean.class.getPackage())
                .addPackage(OrganisationWebServiceImpl.class.getPackage())
                .addPackage(ExpectedVerifier.class.getPackage());}
}
