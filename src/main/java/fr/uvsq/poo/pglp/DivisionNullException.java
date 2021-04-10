package fr.uvsq.poo.pglp;

/**
 * Empêcher la division par zéro.
 */
public class DivisionNullException extends Exception {
    /**
     *  Exception de division par zéro.
     */
    public DivisionNullException() {
        super("Can't divide by zero!");
    }
}
