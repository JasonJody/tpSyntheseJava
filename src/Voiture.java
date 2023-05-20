// Classe dérivée Voiture
class Voiture extends Vehicule {
    private int nombrePortes;

    /**
     * Constructeur d'une voiture.
     *
     * @param marque       La marque de la voiture.
     * @param modele       Le modèle de la voiture.
     * @param annee        L'année de fabrication de la voiture.
     * @param nombrePortes Le nombre de portes de la voiture.
     */
    public Voiture(String marque, String modele, int annee, int nombrePortes) {
        super(marque, modele, annee);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        return "Voiture : Marque=" + getMarque()
                + ", Modèle=" + getModele()
                + ", Année=" + getAnnee()
                + ", Nombre de portes=" + nombrePortes;
    }

    // Getter et setter
    //TODO 5

    /**
     * Obtient le nombre de portes de la voiture.
     *
     * @return Le nombre de portes de la voiture.
     */
    public int getNombrePortes() {
        return nombrePortes;
    }

    /**
     * Définit le nombre de portes de la voiture.
     *
     * @param nombrePortes Le nombre de portes de la voiture.
     */
    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
}
