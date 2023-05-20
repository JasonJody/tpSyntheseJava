// Classe dérivée
// TODO 1.1
class  Chien extends Animal {

    private String race;

    /**
     * Constructeur pour créer un objet Chien.
     *
     * @param nom  Le nom du chien.
     * @param age  L'âge du chien.
     * @param race La race du chien.
     */
    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Wouf Wouf.");
    }

    /**
     * Récupère la race du chien.
     *
     * @return La race du chien.
     */
    public String getRace() {
        return race;
    }

    /**
     * Définit la race du chien.
     *
     * @param r La race du chien.
     */
    public void setRace(String r) {
        this.race = r;
    }

    @Override
    public String toString() {
        return "Chien [race="+race+", " + super.toString() + "]";
    }
}