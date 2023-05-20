
// Classe dérivée Footballeur
class Footballeur extends Joueur {

    private String equipe;

    /**
     * Constructeur pour créer un objet Footballeur.
     *
     * @param nom    Le nom du footballeur.
     * @param age    L'âge du footballeur.
     * @param equipe L'équipe du footballeur.
     */
    public Footballeur(String nom, int age, String equipe) {
        super(nom, age);
        this.equipe = equipe;
    }
    // TODO 2

    // Implémentation de la méthode abstraite pour afficher les détails du footballeur, incluant l'équipe
    @Override
    public void afficherDetails() {
        System.out.println("Nom: " + getNom());
        System.out.println("Âge: " + getAge());
        System.out.println("Équipe: " + equipe);
    }

    /**
     * Définit l'équipe du footballeur.
     *
     * @param equipe L'équipe du footballeur.
     */
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    /**
     * Récupère l'équipe du footballeur.
     *
     * @return L'équipe du footballeur.
     */
    public String getEquipe() {
        return equipe;
    }

}



