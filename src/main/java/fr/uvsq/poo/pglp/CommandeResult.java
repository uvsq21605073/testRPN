package fr.uvsq.poo.pglp;

/**
 * Action d'affichage de la pile implémentant le pattern Command.
 */
public class CommandeResult implements ICommande {
    /**
     * Moteur d'exécution de la commande d'affichage.
     */
    private MoteurRPN moteurRPN;

    /**
     * Constructeur de l'action d'affichage de pile.
     * @param mrpn moteur d'exécution.
     */
    public CommandeResult(final MoteurRPN mrpn) {
        this.moteurRPN = mrpn;
    }

    /**
     * apply de l'affichage de la pile respectant le pattern Command.
     */
    @Override
    public void apply() {
        this.moteurRPN.printStack();
    }

}
