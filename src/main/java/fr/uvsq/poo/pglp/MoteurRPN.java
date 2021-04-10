package fr.uvsq.poo.pglp;

/**
 * Classe implémentant les opérations de l'interpréteur.
 */
public class MoteurRPN extends Interpreteur {
    /**
     * Construire le moteur des opérations de calcul.
     */
    public MoteurRPN() {
        super();
    }

    /**
     * Enregistrer une opérande dans la pile.
     * @param op1 une opérande.
     */
    public void register(final double op1) {
        pile.push(op1);
    }


    /**
     *  Réaliser une opération en fonction de l'opérande.
     * @param operand une opérande décrivant le type de calcul
     * @param op1 première opérande.
     * @param op2 seconde opérande.
     * @return résultat de calcul arithmétique.
     *
     */
    public double calculation(final char operand, final double op1, final double op2)  {
       double result = 0.0;
       switch (operand) {
                    case '-':
                        return operation.minus(op1, op2);
                    case '+':
                        return operation.plus(op1, op2);
                    case '*':
                        return operation.multiply(op1, op2);
                    case '/':
                        try {
                            return operation.divide(op1, op2);
                        }  catch (DivisionNullException exception) {
                            exception.printStackTrace();
                        }
                        break;
                    default:
                        break;
       }
       return result;
}



}
