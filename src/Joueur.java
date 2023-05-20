// Classe abstraite Joueur
abstract class Joueur {
    private String nom;
    private int age;

    /**
     * Constructeur pour créer un objet Joueur.
     *
     * @param nom Le nom du joueur.
     * @param age L'âge du joueur.
     */
    public Joueur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters et setters

    /**
     * Récupère le nom du joueur.
     *
     * @return Le nom du joueur.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du joueur.
     *
     * @param nom Le nom du joueur.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère l'âge du joueur.
     *
     * @return L'âge du joueur.
     */
    public int getAge() {
        return age;
    }

    /**
     * Définit l'âge du joueur.
     *
     * @param age L'âge du joueur.
     */
    public void setAge(int age) {
        this.age = age;
    }

    // Méthode abstraite pour afficher les détails spécifiques du joueur
    public abstract void afficherDetails();
}

