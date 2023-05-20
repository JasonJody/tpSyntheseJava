
// Classe dérivée Footballeur
class Footballeur extends Joueur {

    private String equipe;
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

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

}



