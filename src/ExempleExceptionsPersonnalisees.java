// Classe utilisant les exceptions personnalisées
class ExempleExceptionsPersonnalisees {
    private int valeur;

    // Méthode pour définir la valeur. N'acepte que des valeurs entre 1 et 100 inclusivement.
    //TODO 7


    public void setValeur(int valeur) throws numberError {
        int max = 100;
        int min = 1;
        if (valeur <  min) {
            throw new numberError("Valeur trop petite");
        } else if (valeur > max) {
            throw new numberError("Valeur trop grande");
        }
        this.valeur = valeur;
    }

    // Méthode pour effectuer une opération
    public void effectuerOperation() throws OperationNonAutoriseeException {
        // Condition de vérification pour l'opération
        boolean condition = true;

        if (!condition) {
            throw new OperationNonAutoriseeException("L'opération n'est pas autorisée.");
        }

        // Logique de l'opération
    }

    public static class numberError extends Exception {
        public numberError(String message) {
            super(message);
        }
    }
    public static class OperationNonAutoriseeException extends Exception {
        public OperationNonAutoriseeException(String message) {
            super(message);
        }
    }
}
