package fr.uvsq.poo.pglp;

public class CommandeExit implements Commande {
    private Interpreteur I;

    public CommandeExit(Interpreteur I){
        this.I = I;
    }

    @Override
    public void command(){
        this.I.exit();
    }
}
