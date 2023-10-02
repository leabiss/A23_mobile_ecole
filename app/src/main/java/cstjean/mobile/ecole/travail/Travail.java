package cstjean.mobile.ecole.travail;

import java.util.Calendar;

/**
 * Un travail scolaire.
 *
 * @author Léa Bissonnette-Vir
 */
public class Travail {
    /**
     * Le nom du travail.
     **/
    private final String nom;
    /**
     * Date de remise du travail.
     */
    private final Calendar dateRemise;

    /**
     * Constructeur.
     *
     * @param nom Le nom du travail
     * @param dateRemise date de remise du travail
     */
    public Travail(String nom, Calendar dateRemise) {
        this.nom = nom;
        this.dateRemise = dateRemise;
    }

    /**
     * Récupère le nom du travail.
     *
     * @return Le nom du travail
     */
    public String getNom() {
        return nom;
    }

    public Calendar getDateRemise() {
        return dateRemise;
    }
}
