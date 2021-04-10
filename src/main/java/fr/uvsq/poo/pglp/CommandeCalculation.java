package fr.uvsq.poo.pglp;
import java.util.Stack;

/**
 * Action de calcul implémentant le pattern Command.
 */
public class CommandeCalculation implements ICommande {
    /**
     * Moteur d'execution de la commande de calcul.
     */
    private MoteurRPN mrpn;
    /**
     * Caractere représentant l'operation demandée.
     */
    private char operator;

    /**
     * Constructeur de l'action de calcul.
     * @param moteur moteur de calcul.
     * @param oper operande du calcul.
     */
    public CommandeCalculation(final MoteurRPN moteur, final char oper) {
        this.mrpn = moteur;
        this.operator = oper;
    }

    /**
     * apply du calcul respectant le Pattern Command.
     */
    @Override
    public void apply() throws DivisionNullException {
        double resultat = 0.0;
        double sommetPile = 0.0;
        double secondPile = 0.0;
        if (this.mrpn.pile.size() >= 2) {
                this.mrpn.pileSave = (Stack<Double>) this.mrpn.pile.clone();
                sommetPile = this.mrpn.pile.pop();
                secondPile = this.mrpn.pile.pop();
                if (sommetPile == 0) {
                    mrpn.setFlagDivZero(true);
                    throw new DivisionNullException();
                } else {
                    System.out.println(operator);
                    resultat = this.mrpn.calculation(operator, sommetPile, secondPile);
                    this.mrpn.register(resultat);
                }
        } else {
            System.out.println("Not enough operand to calculate!");
               }
    }

    /**
     *  Accesseur du moteur de calcul.
     * @return moteur de calcul.
     */
   public MoteurRPN getMrpn() {
        return this.mrpn;
   }

    /**
     * Mutateur de l'operande du calcul.
     * @param oper operande de calcul.
     */
    public void setOperator(final char oper) {
        this.operator = oper;
    }


}
