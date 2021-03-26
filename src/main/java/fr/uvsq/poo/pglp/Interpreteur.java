package fr.uvsq.poo.pglp;

import java.util.Stack;

public class Interpreteur {
    public Stack<Double> pile;
    public Interpreteur() {
        this.pile = new Stack<Double>();
    }
    public void exit() {
        System.exit(0);
    }
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