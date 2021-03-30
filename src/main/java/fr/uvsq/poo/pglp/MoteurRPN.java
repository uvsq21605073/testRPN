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
     */
    public void calculation(final char operand) {
        if (super.getPile().size() >= 2) {
            Operation operation = new Operation();
            switch (operand) {
                case '-':
                    super.getPile().push(operation.minus(super.getPile().pop(), super.getPile().pop()));
                    break;
                case '+':
                    super.getPile().push(operation.plus(super.getPile().pop(), super.getPile().pop()));
                    break;
                case '*':
                    super.getPile().push(operation.multiply(super.getPile().pop(), super.getPile().pop()));
                    break;
                case '/':
                    super.getPile().push(operation.divide(super.getPile().pop(), super.getPile().pop()));
                    break;
                default:
                    System.exit(0);
                }
            }
    }

    /**
     * Retourner la pile du calcul.
     * @return la pile du calcul de type double.
     */
    public Stack<Double> result() {
        return super.getPile();
    }
}
