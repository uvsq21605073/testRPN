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
        pile.push(op1);
    }

    /**
     * Réaliser une opération en fonction de l'opérande.
     * @param operand une opérande décrivant le type de calcul.
     * @return
     */
    public double calculation(final char operand,final double op1,final double op2) throws DivisionNullException {
       double result = 0.0;
       switch (operand) {
                    case '-':
                        return operation.minus(op1, op2);
                    case '+':
                        return operation.plus(op1, op2);
                    case '*':
                        return operation.multiply(op1,op2);
                    case '/':
                        return operation.divide(op1, op2);
       }
       return result;
}



}
