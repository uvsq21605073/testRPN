package fr.uvsq.poo.pglp;
import java.util.Scanner;

/**
 * Classe qui gère les interactions avec l’utilisateur et invoque le moteur RPN.
 */
public class SaisieRPN {
    /**
     * Récupérateur du flux de saisie.
     */
  private Scanner scanner;
    /**
     *  Moteur d'exécution des commandes.
     */
  private MoteurRPN moteurRPN;
    /**
     * Créateur de l'objet calculatrice.
     */
  private CommandeFactory commandFactory;

    /**
     * Constructeur de gestionnaire de l'interaction utilisateur.
     * @param moteur moteur d'exécution des commandes.
     */
    public SaisieRPN(final MoteurRPN moteur) {
        scanner = new Scanner(System.in, "UTF-8");
        moteurRPN = moteur;
        commandFactory = new CommandeFactory();
        commandFactory = commandFactory.createSession(moteurRPN);
    }

    /**
     * Gérer les saisies utilisateur.
     */
    public void handleInput() {
       String inputString = new String();
        int numberInput = 0;
        System.out.println("Veuillez saisir une operation RPN (undo,exit, ou operandes)!");
        do {

            inputString = scanner.next();
            double result = 0.0;
            boolean flag = moteurRPN.getFlagDivZero();
            //System.out.println("Saisie:"+ inputString );
            if (inputString.matches("[0-9]+")) {
                    result = Double.parseDouble(inputString);
                    commandFactory.addValue(moteurRPN, result);
                    commandFactory.execute("register");
            } else if (inputString.equals("+")) {
                commandFactory.addOperation(moteurRPN, '+');
                commandFactory.execute("calculation");
            } else if (inputString.equals("-")) {
                commandFactory.addOperation(moteurRPN, '-');
                commandFactory.execute("calculation");
            } else if (inputString.equals("*")) {
                commandFactory.addOperation(moteurRPN, '*');
                commandFactory.execute("calculation");
            } else if (inputString.equals("/")) {
                commandFactory.addOperation(moteurRPN, '/');
                commandFactory.execute("calculation");
            } else if (flag == true && inputString == "undo") {
                commandFactory.execute("empty");
            } else {
                commandFactory.execute(inputString);
            }
        } while (numberInput != 1);

    }
}
