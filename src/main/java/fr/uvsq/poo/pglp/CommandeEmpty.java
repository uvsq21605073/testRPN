package fr.uvsq.poo.pglp;

/**
 * Action de vider entièrement la pile.
 */
public class CommandeEmpty implements ICommande {
    /**
     * Interpreteur générique.
     */
    private Interpreteur interpr;

    /**
     * Constructeur de l'action de vider la pile.
     * @param interpreteur interpreteur générique.
     */
    public CommandeEmpty(final Interpreteur interpreteur) {
      this.interpr = interpreteur;
    }

    /**
     * apply de l'empty respectant le pattern Command.
     */
    @Override
    public void apply() {
      this.interpr.empty();
    }
}
