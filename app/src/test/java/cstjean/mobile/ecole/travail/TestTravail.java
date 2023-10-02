package cstjean.mobile.ecole.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

/**
 * Tests pour Travail.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestTravail extends TestCase {

    /**
     * Test la création d'objets Travail.
     */
    public void testCreer() {
        Calendar dateRemise = new GregorianCalendar(2023, Calendar.SEPTEMBER, 10);

        String nomTravail1 = "TP1";
        Travail travail1 = creerTravail(nomTravail1, dateRemise);
        assertEquals(nomTravail1, travail1.getNom());
        assertEquals(dateRemise, travail1.getDateRemise());

        String nomTravail2 = "TP2";
        Travail travail2 = creerTravail(nomTravail2, dateRemise);
        assertEquals(nomTravail2, travail2.getNom());
        assertEquals(dateRemise, travail2.getDateRemise());
    }

    /**
     * Méthode pour créer un nouveau travail.
     *
     * @param nom nom du travail
     * @param dateRemise date de remise du travail
     * @return un travail
     */
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new Travail(nom, dateRemise);
    }
}
