package fr.uvsq.poo.pglp;

/**
 * Action de sortie implémentant le pattern Command.
 */
public class CommandeExit implements ICommande {
    /**
     * Interpréteur générique.
     */
    private Interpreteur intp;

    /**
     * Constructeur de l'action de sortie.
     * @param interpretator interpréteur générique.
     */
    public CommandeExit(final Interpreteur interpretator) {
        this.intp = interpretator;
    }

    /**
     * apply de la sortie respectant le Pattern Command.
     */
    @Override
    public void apply() {
        this.intp.exit();
    }

}
