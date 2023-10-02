package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import cstjean.mobile.travail.Travail;
import java.util.Calendar;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

/**
 * Classe de test pour la classe RapportTravaux.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestRapportTravaux extends TestCase {
    /**
     * Test le rapport.
     */
    public void testRapportTravaux() {
        CoursSession coursSession = new CoursSession("Philo", "101");
        Calendar dateRemise = new GregorianCalendar(2023, Calendar.SEPTEMBER, 15);

        Travail travail1 = new Travail("TP1", dateRemise);
        Travail travail2 = new Travail("TP2", dateRemise);

        coursSession.ajouterTravail(travail1);
        coursSession.ajouterTravail(travail2);

        String rapportTravaux = RapportTravaux.getRapportTravaux(coursSession);

        assertEquals(RapportTravaux.ENTETE_RAPPORT_TRAVAUX +
                "TP1 - 2023-09-15" + RapportTravaux.SAUT_LIGNE +
                "TP2 - 2023-09-15" + RapportTravaux.SAUT_LIGNE +
                "Total : 2" +
                RapportTravaux.PIED_PAGE_RAPPORT_TRAVAUX, rapportTravaux);
    }
}
