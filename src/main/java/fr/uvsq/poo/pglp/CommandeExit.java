package fr.uvsq.poo.pglp;

public class CommandeExit implements ICommande {
    private Interpreteur I;

    public CommandeExit(Interpreteur I){
        this.I = I;
    }

    @Override
    public void apply(){
        this.I.exit();
    }

    @Override
    public void unapply() {

    }
}
