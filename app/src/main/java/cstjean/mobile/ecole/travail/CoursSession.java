package cstjean.mobile.ecole.travail;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe CoursSession.
 *
 * @author Léa Bissonnette-Vir
 */
public class CoursSession implements Comparable<CoursSession> {
    /**
     * Département du cours session.
     */
    private final String departement;
    /**
     * Numéro du cours session.
     */
    private final String numero;
    /**
     * Liste des travaux du cours session.
     */
    private final List<Travail> travaux = new ArrayList<>();

    /**
     * Compteur de cours session créé.
     */
    private static int compteur = 0;

    /**
     * Constructeur.
     *
     * @param departement département du cours de session
     * @param numero numéro du cours de session
     */
    public CoursSession(String departement, String numero) {
        this.departement = departement;
        this.numero = numero;
        incrementerCompteur();
    }

    private static void incrementerCompteur() {
        compteur++;
    }

    static int getCompteur() {
        return compteur;
    }

    /**
     * Méthode pour reset le compteur de cours session.
     */
    static void resetCompteur() {
        compteur = 0;
    }

    public String getDepartement() {
        return departement;
    }

    public String getNumero() {
        return numero;
    }

    public int getNombreTravaux() {
        return travaux.size();
    }

    /**
     * Méthode qui ajoute un travail à la liste de travaux.
     *
     * @param travail travail à ajouter à la liste
     */
    public void ajouterTravail(Travail travail) {
        travaux.add(travail);
    }

    /**
     * Getter travail.
     *
     * @param index l'index du travail à retourner
     * @return le travail à l'index donné
     */
    public Travail getTravail(int index) {
        return travaux.get(index);
    }

    @Override
    public int compareTo(CoursSession o) {
        int compareDepartement = getDepartement().compareTo(o.getDepartement());

        if (compareDepartement != 0) {
            return compareDepartement;
        }

        return getNumero().compareTo(o.getNumero());
    }
}
