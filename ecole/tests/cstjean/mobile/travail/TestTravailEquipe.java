package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Classe de test des travaux d'équipes.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestTravailEquipe extends TestTravail {
    /**
     * Teste l'ajout d'un coéquipier.
     */
    public void testAjoutCoequipiers() {
        TravailEquipe travail = (TravailEquipe) creerTravail("TP1",
                new GregorianCalendar(2023, Calendar.SEPTEMBER, 20));

        int da1 = 123456;
        String nomCoequipier1 = "Coéquipier 1";
        travail.ajouterCoequipier(da1, nomCoequipier1);
        assertEquals(nomCoequipier1, travail.getCoequipier(da1));

        int da2 = 789012;
        String nomCoequipier2 = "Coéquipier 2";
        travail.ajouterCoequipier(da2, nomCoequipier2);
        assertEquals(nomCoequipier2, travail.getCoequipier(da2));

        assertEquals(nomCoequipier1, travail.getCoequipier(da1));
    }

    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise) {
        return new TravailEquipe(nom, dateRemise);
    }
}
