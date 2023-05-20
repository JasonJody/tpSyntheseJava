// Classe abstraite Vehicule
abstract class Vehicule {
    private String marque;
    private String modele;
    private int annee;

    /**
     * Constructeur d'un véhicule.
     *
     * @param marque La marque du véhicule.
     * @param modele Le modèle du véhicule.
     * @param annee  L'année du véhicule.
     */
    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    // Getters et setters

    /**
     * Obtient la marque du véhicule.
     *
     * @return La marque du véhicule.
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Définit la marque du véhicule.
     *
     * @param marque La marque du véhicule.
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * Obtient le modèle du véhicule.
     *
     * @return Le modèle du véhicule.
     */
    public String getModele() {
        return modele;
    }

    /**
     * Définit le modèle du véhicule.
     *
     * @param modele Le modèle du véhicule.
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * Obtient l'année du véhicule.
     *
     * @return L'année du véhicule.
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Définit l'année du véhicule.
     *
     * @param annee L'année du véhicule.
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode abstraite pour afficher les détails spécifiques du véhicule
    public abstract String toString();
}
