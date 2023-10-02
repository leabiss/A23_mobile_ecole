package cstjean.mobile.ecole.travail.rapport;

import cstjean.mobile.ecole.travail.CoursSession;
import junit.framework.TestCase;

/**
 * Classe de test des rapports de cours.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestRapportCours extends TestCase {
    /**
     * Test le rapport du cours.
     */
    public void testRapport() {
        RapportCours rapport = new RapportCours();

        rapport.ajouter(new CoursSession("Littérature", "201"));
        rapport.ajouter(new CoursSession("Philo", "101"));
        rapport.ajouter(new CoursSession("Math", "101"));
        rapport.ajouter(new CoursSession("Philo", "201"));
        rapport.ajouter(new CoursSession("Math", "301"));

        assertEquals("Littérature 201" + RapportCours.SAUT_LIGNE +
                "Math 101" + RapportCours.SAUT_LIGNE +
                "Math 301" + RapportCours.SAUT_LIGNE +
                "Philo 101" + RapportCours.SAUT_LIGNE +
                "Philo 201" + RapportCours.SAUT_LIGNE,
                rapport.getRapportCours());
    }
}
