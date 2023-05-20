// Classe Impot
class Impot {
    private String nomContribuable;
    private double revenuAnnuel;
    private double tauxImposition;

    // Constructeur
    public Impot(String nomContribuable, double revenuAnnuel, double tauxImposition) {
        this.nomContribuable = nomContribuable;
        this.revenuAnnuel = revenuAnnuel;
        this.tauxImposition = tauxImposition;
    }

    // Getter et setter
    public String getNomContribuable() {
        return nomContribuable;
    }

    public void setNomContribuable(String nomContribuable) {
        this.nomContribuable = nomContribuable;
    }

    //TODO 4

    public void afficher() {
        System.out.printf("%s a un revenue de %f$ et un taux d'imposition de %f%%",
                nomContribuable,revenuAnnuel,(tauxImposition*100));
    }

    public double calculerImpot() {
        return revenuAnnuel * tauxImposition;
    }

    public void setTauxImposition(double tauxImposition) {
        this.tauxImposition = tauxImposition;
    }

    public double getTauxImposition() {
        return tauxImposition;
    }

    public void setRevenuAnnuel(double revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel;
    }

    public double getRevenuAnnuel() {
        return revenuAnnuel;
    }


}
