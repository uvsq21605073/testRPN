package fr.uvsq.poo.pglp;

/**
 * Action élémentaire d'annulation de la dernière saisie.
 */
public class CommandeUndo implements ICommande {
    /**
     *  Interpréteur générique.
     */
    private Interpreteur interpr;

    /**
     * Constructeur de l'action Undo.
     * @param intp interpréteur générique.
     */
    public CommandeUndo(final Interpreteur intp) {
        this.interpr = intp;
    }

    /**
     * apply de l'undo respectant le pattern Command.
     */
    @Override
    public void apply() {
        this.interpr.undo();
    }

}
