package fr.uvsq.poo.pglp;

public class CommandeRegister implements Commande {
    private MoteurRPN MRPN;
    private double Value;

    public CommandeRegister(MoteurRPN MRPN,double Value){
        this.MRPN = MRPN;
        this.Value = Value;
    }

    @Override
    public void command(){
        this.MRPN.register(Value);
    }
}
