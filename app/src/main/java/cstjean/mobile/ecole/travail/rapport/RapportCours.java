package cstjean.mobile.ecole.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe rapport de cours.
 *
 * @author Léa Bissonnette-Vir
 */
public class RapportCours extends Rapport {
    /**
     * Liste de cours session.
     */
    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    /**
     * Méthode pour ajouter un cours de session à la liste listCoursSession.
     *
     * @param coursSession cours session à ajouter à la liste
     */
    void ajouter(CoursSession coursSession) {
        this.listeCoursSession.add(coursSession);
    }

    /**
     * Méthode qui construit le rapport de cours.
     *
     * @return le rapport complet des cours
     */
    String getRapportCours() {
        StringBuilder builder = new StringBuilder();

        Collections.sort(listeCoursSession);

        for (CoursSession cours : listeCoursSession) {
            builder.append(cours.getDepartement())
                    .append(" ")
                    .append(cours.getNumero())
                    .append(SAUT_LIGNE);
        }

        return builder.toString();
    }
}
