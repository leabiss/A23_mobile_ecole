package cstjean.mobile.ecole.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

/**
 * Classe de tests pour la classe CoursSession.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestCoursSession extends TestCase {
    /**
     * Cours de la session.
     */
    private CoursSession coursSession;
    /**
     * Date de remise d'un travail.
     */
    private Calendar dateRemise;

    /**
     * Setup.
     */
    public void setUp() {
        coursSession = new CoursSession("Philo", "101");
        dateRemise = new GregorianCalendar(2023, Calendar.SEPTEMBER, 10);
    }

    /**
     * Test la création d'un cours session.
     */
    public void testCreer() {
        assertEquals("Philo", coursSession.getDepartement());
        assertEquals("101", coursSession.getNumero());
        assertEquals(0, coursSession.getNombreTravaux());
    }

    /**
     * Teste l'ajout d'un travail.
     */
    public void testAjoutTravail() {
        Travail travail1 = new Travail("TP1", dateRemise);
        coursSession.ajouterTravail(travail1);
        assertEquals(1, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));

        Travail travail2 = new Travail("TP2", dateRemise);
        coursSession.ajouterTravail(travail2);
        assertEquals(2, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));
        assertEquals(travail2, coursSession.getTravail(1));
    }

    /**
     * Teste le compteur.
     */
    public void testCompteur() {
        CoursSession.resetCompteur();
        assertEquals(0, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(1, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(2, CoursSession.getCompteur());

        new CoursSession("Philo", "101");
        assertEquals(3, CoursSession.getCompteur());

        CoursSession.resetCompteur();
        assertEquals(0, CoursSession.getCompteur());
    }

    /**
     * Tester le compare.
     */
    public void testCompare() {
        assertEquals(0, coursSession.compareTo(new CoursSession("Philo", "101")));
        assertTrue(coursSession.compareTo(new CoursSession("Philo", "201")) < 0);
        assertTrue(coursSession.compareTo(new CoursSession("Math", "211")) > 0);
    }
}
