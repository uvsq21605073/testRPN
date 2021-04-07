package fr.uvsq.poo.pglp;

public class CommandeResult implements Commande {
    private MoteurRPN MRPN;

    public CommandeResult(MoteurRPN MRPN){
        this.MRPN = MRPN;
    }

    @Override
    public void command(){
        this.MRPN.result();
    }
}
