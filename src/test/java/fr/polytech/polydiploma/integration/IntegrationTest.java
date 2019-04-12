package fr.polytech.polydiploma.integration;

import fr.polytech.polydiploma.GraduateBean;
import fr.polytech.polydiploma.ManageParticipants;
import fr.polytech.polydiploma.ParticipantBean;
import fr.polytech.polydiploma.PlanningUpdater;
import fr.polytech.polydiploma.entities.Speaker;
import fr.polytech.polydiploma.entities.Timeslot;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;
import fr.polytech.polydiploma.exceptions.TimeslotOverlapException;
import fr.polytech.polydiploma.utils.MailAPI;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import javax.ejb.EJB;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IntegrationTest {
    public ParticipantBean participantBean = new ParticipantBean();
    public GraduateBean graduateBean = new GraduateBean();
    public MailAPI mockAPI = new MailAPI();

    @Before
    public void init() {
        mockAPI = mock(MailAPI.class);
        try {
            when(mockAPI.send(any(), any(), any())).thenReturn(true);
        } catch (ExternalPartnerException e) {
            System.out.println("ERR");
        }
        participantBean.init();
        participantBean.getPlanningUpdater().usingAPI(mockAPI);

    }

    @Test
    public void validateTest() {
        participantBean.setFirstName("Test");
        participantBean.setLastName("Test");
        participantBean.setEmail("test.test@test.test");
        assertTrue(participantBean.getPlanningUpdater().getPlanning().getTimeslots().isEmpty());
        Timeslot timeslot = new Timeslot(4, 20, 5, 0);
        Speaker speaker = new Speaker(participantBean.getFirstName(), participantBean.getLastName(), participantBean.getEmail());
        speaker.setId(5L);
        participantBean.getManageParticipants().inviteSpeaker(speaker);
        participantBean.getPlanningUpdater().usingAPI(mockAPI);
        try {
            participantBean.getPlanningUpdater().addTimeslot(timeslot, speaker);
        } catch (ExternalPartnerException | TimeslotOverlapException e) {
            e.printStackTrace();
        }
        assertNotNull(participantBean.getPlanningUpdater().getPlanning().getTimeslots());
    }


}
