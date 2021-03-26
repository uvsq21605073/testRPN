package fr.uvsq.poo.pglp;
import java.util.Stack;
public class MoteurRPN extends Interpreteur {

    public MoteurRPN() {
        super();
    }
    public void register(double op1) {
        super.pile.push(op1);
    }
    public void calculation(char operand) {
            if (super.pile.size() >= 2) {
                Operation O = new Operation();
                if(operand == '-') super.pile.push(O.minus(super.pile.pop(),super.pile.pop()));
                else if(operand == '+') super.pile.push(O.plus(super.pile.pop(),super.pile.pop()));
                else if(operand == '*') super.pile.push(O.multiply(super.pile.pop(),super.pile.pop()));
                else if(operand == '/') super.pile.push(O.divide(super.pile.pop(),super.pile.pop()));
                else System.exit(0);
            }
    }
    public Stack<Double> result() {
        return super.pile;
    }
}