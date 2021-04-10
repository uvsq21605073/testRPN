package fr.uvsq.poo.pglp;

public class CommandeCalculation implements ICommande {
    private MoteurRPN MRPN;
    private char operator;

    public CommandeCalculation(MoteurRPN MRPN,char operator){
        this.MRPN = MRPN;
        this.operator = operator;
    }

    @Override
    public void apply(){
        double resultat = 0.0;
        double sommetPile = 0.0;
        double secondPile = 0.0;
        if (this.MRPN.pile.size() >= 2) {
            try {
                sommetPile = this.MRPN.pile.pop();
                if (this.MRPN.pile.isEmpty()) {
                    System.out.println("Not enough operand to calculate!");
                    this.MRPN.pile.push(sommetPile);
                    return;
                } else {
                    secondPile = this.MRPN.pile.pop();
                    System.out.println(operator);
                    resultat = this.MRPN.calculation(operator, sommetPile, secondPile);
                    this.MRPN.register(resultat);
                }
            } catch (DivisionNullException exception) {
                this.MRPN.pile.push(resultat);
                this.MRPN.pile.push(sommetPile);
                exception.printStackTrace();
            }
        }

    }


    public void setOperator(final char operator){
        this.operator = operator;
    }

}
