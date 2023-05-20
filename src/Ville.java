// Classe dérivée Ville
class Ville extends Pays {
    private String nomVille;

    /**
     * Constructeur d'une ville.
     *
     * @param nom       Le nom du pays.
     * @param population La population de la ville.
     * @param nomVille   Le nom de la ville.
     */
    public Ville(String nom, int population, String nomVille) {
        super(nom, population);
        this.nomVille = nomVille;
    }

    // Getter et setter

   //TODO 3

    /**
     * Définit le nom de la ville.
     *
     * @param nomVille Le nom de la ville.
     */
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    /**
     * Obtient le nom de la ville.
     *
     * @return Le nom de la ville.
     */
    public String getNomVille() {
        return nomVille;
    }
}