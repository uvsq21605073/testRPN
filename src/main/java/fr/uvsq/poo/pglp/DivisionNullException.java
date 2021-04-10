package fr.uvsq.poo.pglp;

public class DivisionNullException extends Exception{
    public DivisionNullException(){
        super("Can't divide by zero!");
    }
}
