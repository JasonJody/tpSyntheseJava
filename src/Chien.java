// Classe dérivée
// TODO 1.1
class  Chien extends Animal {

    private String race;

    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Wouf Wouf.");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String r) {
        this.race = r;
    }

    @Override
    public String toString() {
        return "Chien [race="+race+", " + super.toString() + "]";
    }
}