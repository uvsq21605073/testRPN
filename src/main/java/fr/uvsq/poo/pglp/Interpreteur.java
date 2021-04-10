/**
 * Domain classes used to produce .....
 * <p>
 * These classes contain the ......
 * </p>
 *
 * @since 1.0
 * @author somebody
 * @version 1.0
 */
package fr.uvsq.poo.pglp;

import java.util.Stack;

/**
 * Classe Interprétant les opérations de la calculatrice.
 */
public class Interpreteur {
    /**
     * Pile conservant les opérandes.
     */
    protected Stack<Double> pile;
    protected Stack<Double> pileSave = new Stack<Double>();
    protected Operation operation;
    /**
     *  Créer la pile d'opérandes.
     */
    public Interpreteur() {
        this.pile = new Stack<Double>();
        this.operation = new Operation();
    }


    /**
     *  Opération de sortie de la calculatrice.
     */
    public void exit() {
        System.exit(0);
    }

    /**
     * Opération afin de défaire la dernière action réalisée.
     */
    public void undo() {
        pile=pileSave;
    }
    public Stack<Double> result(){
        return this.pile;
    }
    public void printStack() {
        System.out.println(pile.toString().replaceAll("\\[", "|").replaceAll("]", "|<- head"));

    }
}
