package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import cstjean.mobile.travail.Travail;
import java.text.SimpleDateFormat;

/**
 * Classe RapportTravaux.
 *
 * @author Léa Bissonnette-Vir
 */
public class RapportTravaux extends Rapport {
    /**
     * Constante pour faire l'entête d'un rapport de travaux.
     */
    static final String ENTETE_RAPPORT_TRAVAUX = "---------- TRAVAUX ----------" + SAUT_LIGNE;
    /**
     * Constante pour faire le pied de la page d'un rapport de travaux.
     */
    static final String PIED_PAGE_RAPPORT_TRAVAUX = SAUT_LIGNE + "-----------------";

    /**
     * Méthode qui construit le rapport de travaux.
     *
     * @param coursSession cours de la session pour faire le rapport des travaux
     * @return le rapport complet des travaux en string
     */
    static String getRapportTravaux(CoursSession coursSession) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

        StringBuilder builder = new StringBuilder();

        builder.append(ENTETE_RAPPORT_TRAVAUX);

        for (int i = 0; i < coursSession.getNombreTravaux(); i++) {
            Travail travail = coursSession.getTravail(i);

            builder.append(travail.getNom())
                    .append(" - ")
                    .append(formatDate.format(travail.getDateRemise().getTime()))
                    .append(SAUT_LIGNE);
        }

        builder.append("Total : ")
                .append(coursSession.getNombreTravaux())
                .append(PIED_PAGE_RAPPORT_TRAVAUX);

        return builder.toString();
    }
}
