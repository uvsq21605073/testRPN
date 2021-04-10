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
    /**
     *  Flag afin de ne pas undo une division par zero.
     */
    boolean flagDivZero = false;
    /**
     * Pile de sauvegarde pour undo.
     */
    protected Stack<Double> pileSave = new Stack<Double>();
    /**
     * Operation arithmétique.
     */
    protected Operation operation;
    /**
     *  Créer la pile d'opérandes.
     */
    public Interpreteur() {
        this.pile = new Stack<Double>();
        this.operation = new Operation();
    }


    /**
     *  Sortie de la calculatrice.
     */
    public void exit() {
        System.exit(0);
    }

    /**
     * Défaire la dernière action réalisée.
     */
    public void undo() {
        pile = pileSave;
    }

    /**
     * Vider la pile d'opérandes.
     */
     public void empty() {
         pile.clear();
     }
    /**
     * Mutateur flag division par zero.
     * @param bool false si exception division par zero, true sinon.
     */
    public void setFlagDivZero(final boolean bool) {
       flagDivZero = bool;
    }

    /**
     * Accesseur flag division par zero.
     * @return booleen si division par zero effectuée.
     */
    public boolean getFlagDivZero() {
      return flagDivZero;
    }

    /**
     * Affichage de la pile principale.
     */
    public void printStack() {
        System.out.println(pile.toString().replaceAll("\\[", "|").replaceAll("]", "|<- head"));

    }
}
