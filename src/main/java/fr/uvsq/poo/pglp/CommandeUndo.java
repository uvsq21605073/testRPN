package fr.uvsq.poo.pglp;

public class CommandeUndo implements ICommande {
    private Interpreteur I;

    public CommandeUndo(Interpreteur I){
        this.I = I;
    }

    @Override
    public void apply(){
        this.I.undo();
    }

}
