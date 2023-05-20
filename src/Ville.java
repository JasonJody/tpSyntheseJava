// Classe dérivée Ville
class Ville extends Pays {
    private String nomVille;

    // Constructeur
    public Ville(String nom, int population, String nomVille) {
        super(nom, population);
        this.nomVille = nomVille;
    }

    // Getter et setter

   //TODO 3


    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomVille() {
        return nomVille;
    }
}