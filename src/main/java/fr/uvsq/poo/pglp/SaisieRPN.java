package fr.uvsq.poo.pglp;
import java.util.Scanner;

/**
 * Classe qui gère les interactions avec l’utilisateur et invoque le moteur RPN
 */
public class SaisieRPN {
  private Scanner scanner;
  private MoteurRPN moteurRPN;
  private CommandeFactory commandFactory;
    /**
     * Construire la Saisie de l’utilisateur.
     */
    public SaisieRPN (MoteurRPN moteur) {
        scanner = new Scanner( System.in,"UTF-8");
        moteurRPN = moteur;
        commandFactory = new CommandeFactory();
        commandFactory = commandFactory.createSession(moteurRPN);
    }

    public void handleInput() {
       String inputString = new String();

        int number_input = 0;
        do{
            System.out.print( "Veuillez saisir une operation RPN : " );
            inputString = scanner.nextLine();
            double result = 0.0;
            System.out.println("Saisie:"+ inputString );
            if(inputString.matches("[0-9]+")){
                    result = Double.parseDouble(inputString);
                    commandFactory.addValue(result);
                    commandFactory.execute("register");
            }
            else if(inputString.equals("+")){
                commandFactory.addOperation('+');
                commandFactory.execute("calculation");
            }
            else if(inputString.equals("-")){
                commandFactory.addOperation('-');
                commandFactory.execute("calculation");
            }
            else if(inputString.equals("*")){
                commandFactory.addOperation('*');
                commandFactory.execute("calculation");
            }
            else if(inputString.equals("/")){
                commandFactory.addOperation('/');
                commandFactory.execute("calculation");
            }
            else{
                commandFactory.execute(inputString);
            }
        }while(number_input != 1);

    }
}
