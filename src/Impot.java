// Classe Impot
class Impot {
    private String nomContribuable;
    private double revenuAnnuel;
    private double tauxImposition;

    /**
     * Constructeur pour créer un objet Impot.
     *
     * @param nomContribuable Le nom du contribuable.
     * @param revenuAnnuel    Le revenu annuel du contribuable.
     * @param tauxImposition  Le taux d'imposition applicable.
     */
    public Impot(String nomContribuable, double revenuAnnuel, double tauxImposition) {
        this.nomContribuable = nomContribuable;
        this.revenuAnnuel = revenuAnnuel;
        this.tauxImposition = tauxImposition;
    }

    // Getter et setter

    /**
     * Récupère le nom du contribuable.
     *
     * @return Le nom du contribuable.
     */
    public String getNomContribuable() {
        return nomContribuable;
    }

    /**
     * Définit le nom du contribuable.
     *
     * @param nomContribuable Le nom du contribuable.
     */
    public void setNomContribuable(String nomContribuable) {
        this.nomContribuable = nomContribuable;
    }

    //TODO 4

    /**
     * Affiche les détails de l'impôt.
     */
    public void afficher() {
        System.out.println("Nom du contribuable: " + nomContribuable);
        System.out.println("Revenu annuel: " + revenuAnnuel);
        System.out.println("Taux d'imposition: " + tauxImposition);
        System.out.println("Impôt à payer: " + calculerImpot());
    }

    /**
     * Calcule l'impôt à payer.
     *
     * @return L'impôt à payer.
     */
    public double calculerImpot() {
        return revenuAnnuel * tauxImposition;
    }

    /**
     * Définit le taux d'imposition.
     *
     * @param tauxImposition Le taux d'imposition.
     */
    public void setTauxImposition(double tauxImposition) {
        this.tauxImposition = tauxImposition;
    }

    /**
     * Récupère le taux d'imposition.
     *
     * @return Le taux d'imposition.
     */
    public double getTauxImposition() {
        return tauxImposition;
    }

    /**
     * Définit le revenu annuel du contribuable.
     *
     * @param revenuAnnuel Le revenu annuel du contribuable.
     */
    public void setRevenuAnnuel(double revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel;
    }

    /**
     * Récupère le revenu annuel du contribuable.
     *
     * @return Le revenu annuel du contribuable.
     */
    public double getRevenuAnnuel() {
        return revenuAnnuel;
    }
}
