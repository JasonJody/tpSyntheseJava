// Classe utilisant les exceptions personnalisées
class ExempleExceptionsPersonnalisees {
    private int valeur;

    //TODO 7

    /**
     * Méthode pour définir la valeur. N'accepte que des valeurs entre 1 et 100 inclusivement.
     *
     * @param valeur La valeur à définir.
     * @throws ValeurHorsLimiteException Si la valeur est en dehors de la plage autorisée (1-100).
     */
    public void setValeur(int valeur) throws ValeurHorsLimiteException {
        int max = 100;
        int min = 1;
        if (valeur <  min || valeur > max) {
            throw new ValeurHorsLimiteException("Valeur hors limite (1-100)");
        }
        this.valeur = valeur;
    }

    /**
     * Méthode pour effectuer une opération.
     *
     * @throws OperationNonAutoriseeException Si l'opération n'est pas autorisée.
     */
    public void effectuerOperation() throws OperationNonAutoriseeException {
        // Condition de vérification pour l'opération
        boolean condition = false;

        if (!condition) {
            throw new OperationNonAutoriseeException("L'opération n'est pas autorisée.");
        }

        // Logique de l'opération
    }
}
