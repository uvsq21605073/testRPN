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
    private Stack<Double> pile;

    /**
     *  Créer la pile d'opérandes.
     */
    public Interpreteur() {
        this.pile = new Stack<Double>();
    }

    /**
     * Accesseur pile opérandes.
     * @return Pile de Double
     */
    public Stack<Double> getPile() {
        return pile;
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
//        this.pile.push(2.1);
//        this.pile.push(2.2);
//        System.out.println("stack: " + this.pile.toString());
        if (this.pile.size() >= 1) {
            this.pile.pop();
            System.out.println("stack: " + this.pile.toString());
        }
    }
}
