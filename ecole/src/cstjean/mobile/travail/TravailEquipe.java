package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Classe de travail d'équipe.
 *
 * @author Léa Bissonnette-Vir
 */
public class TravailEquipe extends Travail {
    /**
     * Map des coéquipiers travaillant sur le travail.
     */
    private final Map<Integer, String> coequipiers = new LinkedHashMap<>();

    /**
     * Constructeur.
     *
     * @param nom nom du travail d'équipe
     * @param dateRemise date de la remise du travail
     */
    public TravailEquipe(String nom, Calendar dateRemise) {
        super(nom, dateRemise);
    }

    /**
     * Méthode pour ajouter un coéquipier au travail.
     *
     * @param da Da du coéquipier à ajouter
     * @param nomCoequipier nom du coéquipier à ajouter
     */
    void ajouterCoequipier(int da, String nomCoequipier) {
        coequipiers.put(da, nomCoequipier);
    }

    /**
     * Getter pour le nom du coéquipier avec le da donné.
     *
     * @param da Da du coéquipier à trouver
     * @return le nom du coéquipier
     */
    String getCoequipier(int da) {
        return coequipiers.get(da);
    }
}
