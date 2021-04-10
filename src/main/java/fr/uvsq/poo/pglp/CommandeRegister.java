package fr.uvsq.poo.pglp;

import java.util.Stack;

public class CommandeRegister implements ICommande {
    private MoteurRPN MRPN;
    private double value;

    public CommandeRegister(MoteurRPN MRPN,double value){
        this.MRPN = MRPN;
        this.value = value;
    }

    @Override
    public void apply(){
        this.MRPN.pileSave = (Stack<Double>) this.MRPN.pile.clone();
        this.MRPN.register(value);
    }


    public void setValue(double value){
        this.value = value;
    }
}
