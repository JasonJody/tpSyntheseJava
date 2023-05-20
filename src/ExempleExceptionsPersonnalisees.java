// Classe utilisant les exceptions personnalisées
class ExempleExceptionsPersonnalisees {
    private int valeur;

    // Méthode pour définir la valeur. N'acepte que des valeurs entre 1 et 100 inclusivement.
    //TODO 7


    public void setValeur(int valeur) throws ValeurHorsLimiteException {
        int max = 100;
        int min = 1;
        if (valeur <  min || valeur > max) {
            throw new ValeurHorsLimiteException("Valeur hors limite (1-100)");
        }
        this.valeur = valeur;
    }

    // Méthode pour effectuer une opération
    public void effectuerOperation() throws OperationNonAutoriseeException {
        // Condition de vérification pour l'opération
        boolean condition = false;

        if (!condition) {
            throw new OperationNonAutoriseeException("L'opération n'est pas autorisée.");
        }

        // Logique de l'opération
    }
}
