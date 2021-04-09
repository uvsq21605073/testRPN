package fr.uvsq.poo.pglp;

public class CommandeResult implements ICommande {
    private MoteurRPN MRPN;

    public CommandeResult(MoteurRPN MRPN){
        this.MRPN = MRPN;
    }

    @Override
    public void apply(){
        this.MRPN.result();
    }

}
