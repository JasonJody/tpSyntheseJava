// Classe dérivée Voiture
class Voiture extends Vehicule {
    private int nombrePortes;

    // Constructeur
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


    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
}
