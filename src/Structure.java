class Structure {
    private Noeud tete;
    private Noeud queue;
   //TODO 6
    // Constructeur
    public Structure() {
        this.tete = null;
        this.queue = null;
    }

    // Méthode pour vérifier si la liste est vide

    /**
     * Vérifie si la liste est vide.
     *
     * @return true si la liste est vide, false sinon.
     */
    public boolean estVide() {
        return tete == null;
    }

    // Méthode pour ajouter un élément à la fin de la liste

    /**
     * Ajoute un élément à la fin de la liste.
     *
     * @param valeur La valeur de l'élément à ajouter.
     */
    public void ajouter(int valeur) {
        Noeud nouveauNoeud = new Noeud(valeur);

        if (estVide()) {
            tete = nouveauNoeud;
            queue = nouveauNoeud;
        } else {
            nouveauNoeud.precedent = queue;
            queue.suivant = nouveauNoeud;
            queue = nouveauNoeud;
        }
    }

    // Méthode pour afficher les éléments de la liste de gauche à droite
    public void afficherDebutVersFin() {
        Noeud courant = tete;
        System.out.print("Liste de gauche à droite : ");
        while (courant != null) {
            System.out.print(courant.valeur + " ");
            courant = courant.suivant;
        }
        System.out.println();
    }

    // Méthode pour afficher les éléments de la liste de droite à gauche
    public void afficherFinVersDebut() {
        Noeud courant = queue;
        System.out.print("Liste de droite à gauche : ");
        while (courant != null) {
            System.out.print(courant.valeur + " ");
            courant = courant.precedent;
        }
        System.out.println();
    }
}
