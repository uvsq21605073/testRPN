package fr.uvsq.poo.pglp;

/**
 * Classe décrivant le type d'opération de calcul arithmétique.
 */
public class Operation {
    /**
     * Constructeur d'opération de calcul.
     */
    public Operation() {
     }

    /**
     * Opération de soustraction de double.
     * @param number1 première opérande de soustraction.
     * @param number2 seconde opérande de soustraction.
     * @return la soustraction de number1 par number2.
     */
    public double minus(final double number1, final double number2) {
        return number1 - number2;
    }

    /**
     * Opération d'addition de double.
     * @param number1 première opérande d'addition.
     * @param number2 seconde opérande d'addition.
     * @return l'addition de number1 et number2.
    */
    public double plus(final double number1, final double number2) {
        return number1 + number2;
    }

    /**
     * Opération de multiplication de double.
     * @param number1 première opérande de multiplication.
     * @param number2 seconde opérande de multiplication.
     * @return la multiplication de number1 par number2.
     */
    public double multiply(final double number1, final double number2) {
        return number1 * number2;
    }

    /**
     * Opération de division de double.
     * @param number1 première opérande de division.
     * @param number2 seconde opérande de division.
     * @return division of two double numbers
     * @throws DivisionNullException division par zéro.
     */
    public double divide(final double number1, final double number2) throws DivisionNullException {
        if (number2 == 0) {
            throw new DivisionNullException();
        } else {
            return number1 / number2;
        }
    }
}
