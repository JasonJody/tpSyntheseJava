// Classe dérivée
// TODO 1.1
class  Chat extends Animal {

    private boolean estInterieur;

    public Chat(String nom, int age, boolean estInterieur) {
        super(nom, age);
        this.estInterieur = estInterieur;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Miaouw.");
    }

    public boolean getInterieur() {
        return estInterieur;
    }

    public void setInterieur(boolean i) {
        estInterieur = i;
    }

    @Override
    public String toString() {
        return "Chat [estInterieur=" + estInterieur + ", " + super.toString() + "]";
    }
}