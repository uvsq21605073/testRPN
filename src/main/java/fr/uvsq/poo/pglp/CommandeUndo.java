package fr.uvsq.poo.pglp;

public class CommandeUndo implements Commande {
    private Interpreteur I;

    public CommandeUndo(Interpreteur I){
        this.I = I;
    }

    @Override
    public void command(){
        this.I.undo();
    }
}
