package fr.polytech.polydiploma;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class GraduateBean implements Serializable {

    @EJB private transient ManageParticipants manageParticipants;

    private static final Logger log = Logger.getLogger(GraduateBean.class.getName());

    private String firstname;
    private String lastname;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Invoked when the "Select" button is pushed
    public String select() {
        Graduate graduate = new Graduate(getFirstname(), getLastname(), getEmail());
        manageParticipants.inviteExpected(graduate);

        FacesContext.getCurrentInstance()
                .addMessage("form-error", new FacesMessage("Added graduate : " + getFirstname() + " " + getLastname()));
        return "";
    }

    // Invoked when the "Register" button is pushed
    public String register() {
        Graduate graduate = new Graduate();
        graduate.setLastname(lastname);
        graduate.setFirstname(firstname);
        graduate.setMail(email);

        manageParticipants.inviteExpected(graduate);
        FacesContext.getCurrentInstance()
                .addMessage("form-success", new FacesMessage("Graduate " + getFirstname() + " " + getLastname() + " has been created!"));
        return "";
    }

}
