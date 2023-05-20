// Classe abstraite
abstract class Animal {
    private String nom;
    private int age;

    /**
     * Constructeur pour créer un objet Animal.
     *
     * @param nom Le nom de l'animal.
     * @param age L'âge de l'animal.
     */
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters et setters

    /**
     * Définit l'âge de l'animal.
     *
     * @param age L'âge à définir.
     * @throws AnimalException Si l'âge fourni n'est pas positif.
     */
    public void setAge(int age) throws AnimalException {
        if (age > 0)
            this.age = age;
        else
            throw new AnimalException("L'âge doit être positive.");
    }
    /**
     * Récupère l'âge de l'animal.
     *
     * @return L'âge de l'animal.
     */
    public int getAge() {return age;}
    
    // Méthode abstraite
    public abstract void faireDuBruit() ;

    // Surcharge de la méthode toString()
    @Override
    public String toString() {
        return "Animal [nom=" + nom + ", age=" + age + "]";
    }

    // Exception personnalisée
    public static class AnimalException extends Exception {
        public AnimalException(String message) {
            super(message);
        }
    }
}
