// Classe dérivée
// TODO 1.1
class  Chat extends Animal {

    private boolean estInterieur;

    /**
     * Constructeur pour créer un objet Chat.
     *
     * @param nom          Le nom du chat.
     * @param age          L'âge du chat.
     * @param estInterieur Indique si le chat est un chat d'intérieur (true) ou d'extérieur (false).
     */
    public Chat(String nom, int age, boolean estInterieur) {
        super(nom, age);
        this.estInterieur = estInterieur;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Miaouw.");
    }

    /**
     * Récupère l'information indiquant si le chat est un chat d'intérieur ou d'extérieur.
     *
     * @return true si le chat est un chat d'intérieur, false sinon.
     */
    public boolean getInterieur() {
        return estInterieur;
    }

    /**
     * Définit si le chat est un chat d'intérieur ou d'extérieur.
     *
     * @param i true si le chat est un chat d'intérieur, false sinon.
     */
    public void setInterieur(boolean i) {
        estInterieur = i;
    }

    @Override
    public String toString() {
        return "Chat [estInterieur=" + estInterieur + ", " + super.toString() + "]";
    }
}