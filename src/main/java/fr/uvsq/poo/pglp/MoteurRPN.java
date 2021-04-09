package fr.uvsq.poo.pglp;
import java.util.Stack;

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
        super.getPile().push(op1); }

    /**
     * Réaliser une opération en fonction de l'opérande.
     * @param operand une opérande décrivant le type de calcul.
     * @return
     */
    public double calculation(final char operand) throws DivisionNullException {
        double result = 0.0;
        if (super.getPile().size() >= 2) {
            Operation operation = new Operation();
            switch (operand) {
                case '-':
                    result = operation.minus(super.getPile().pop(), super.getPile().pop());
                    super.getPile().push(result);
                    break;
                case '+':
                    result = operation.plus(super.getPile().pop(), super.getPile().pop());
                    super.getPile().push(result);
                    break;
                case '*':
                    result = operation.multiply(super.getPile().pop(), super.getPile().pop());
                    super.getPile().push(result);
                    break;
                case '/':
                    result = operation.divide(super.getPile().pop(), super.getPile().pop());
                    super.getPile().push(result);
                default:
                    System.exit(0);
                    break;
                }
            }
        return result;
    }

    /**
     * Retourner la pile du calcul.
     * @return la pile du calcul de type double.
     */
    public Stack<Double> result() {
        return super.getPile();
    }
}
