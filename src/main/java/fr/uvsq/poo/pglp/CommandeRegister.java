package fr.uvsq.poo.pglp;

public class CommandeRegister implements ICommande {
    private MoteurRPN MRPN;
    private double Value;

    public CommandeRegister(MoteurRPN MRPN,double Value){
        this.MRPN = MRPN;
        this.Value = Value;
    }

    @Override
    public void apply(){
        this.MRPN.register(Value);
    }

    @Override
    public void unapply() {

    }
}
