package fr.uvsq.poo.pglp;

/**
 * Hello world!
 *
 */
public class App {
    /**
     *  Main de l'application.
     * @param args les arguments de la ligne de commande.
     */
    public static void main(final String[] args) {

        System.out.println("Hello World!");
        MoteurRPN moteur = new MoteurRPN();
        SaisieRPN saisie = new SaisieRPN(moteur);

        while(true) {
            saisie.handleInput();
        }
    }
}
