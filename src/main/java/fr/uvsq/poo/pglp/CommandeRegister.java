package fr.uvsq.poo.pglp;
import java.util.Stack;

/**
 * Action manipulant la pile implémentant le pattern Command.
 */
public class CommandeRegister implements ICommande {
    /**
     * Moteur d'execution de la manipulation de la pile.
     */
    private MoteurRPN moteurRPN;
    /**
     * Opérande la plus récente.
     */
    private double value;

    /**
     *
     * @param mrpn moteur d'exécution de manipulation de la pile.
     * @param val valeur de l'opérande.
     */
    public CommandeRegister(final MoteurRPN mrpn, final double val) {
        this.moteurRPN = mrpn;
        this.value = val;
    }

    /**
     * apply de l'opération de pile respectant le Pattern Command.
     */
    @Override
    public void apply() {
        this.moteurRPN.pileSave = (Stack<Double>) this.moteurRPN.pile.clone();
        this.moteurRPN.register(value);
    }

    /**
     *  Mutateur de la plus récente opérande.
     * @param val opérande empilée la plus récente.
     */
    public void setValue(final double val) {
        this.value = val;
    }

    /**
     * Accesseur du moteur d'execution d'opération de pile.
     * @return moteur d'exécution.
     */
    public MoteurRPN getMoteurRPN() {
        return moteurRPN;
    }

    /**
     * Accesseur de l'opérande la plus récente.
     * @return opérande.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Création chaîne qui décrit CommandRegister.
     * @return chaîne de caractère formatée.
     */
    public String toString() {
        return "{Pile:" + this.moteurRPN.pile.toString() + "| " + "PileSave:"
                + this.moteurRPN.pileSave.toString() + "| " + this.value + "}";
    }
}
