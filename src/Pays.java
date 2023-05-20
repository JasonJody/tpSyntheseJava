// Classe de base Pays
class Pays {
    private String nom;
    private int population;

    /**
     * Constructeur pour créer un objet Pays.
     *
     * @param nom Le nom du pays.
     * @param population La population du pays.
     */
    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    // Getters et setters

    /**
     * Récupère le nom du pays.
     *
     * @return Le nom du pays.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du pays.
     *
     * @param nom Le nom du pays.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère la population du pays.
     *
     * @return La population du pays.
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Définit la population du pays.
     *
     * @param population La population du pays.
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    // Méthode pour afficher les détails du pays
    public void afficherDetails() {
        System.out.println("Pays: " + nom);
        System.out.println("Population: " + population);
    }
}