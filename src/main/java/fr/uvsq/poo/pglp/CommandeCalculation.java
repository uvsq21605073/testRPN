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
        if (this.MRPN.getPile().size() >= 2) {
            this.MRPN.calculation(operator);
        }
        else {
            System.out.println("Pour effectuer l'opération il faut 2 opérandes, veuillez en rajouter");
        }
    }

    @Override
    public void unapply() {

    }
}
