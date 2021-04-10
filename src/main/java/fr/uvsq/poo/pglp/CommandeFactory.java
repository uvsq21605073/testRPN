package fr.uvsq.poo.pglp;
import java.util.Hashtable;

/**
 * Utilisation Command et Factory pattern
 * suivant Example calculator design.
 *
 */
public class CommandeFactory {
    /**
     * Hashtable des commandes avec pour clé le nom de la commande.
     */
    private final Hashtable<String, ICommande> commandTable;

    /**
     * Template methode Commande.
     */
    public CommandeFactory() {
        commandTable = new Hashtable<>();
    }

    /**
     * Ajout de commande.
     * @param commandName nom de la commande.
     * @param command la commande.
     */
    public void addCommand(final String commandName, final ICommande command) {
        commandTable.put(commandName, command);
    }

    /**
     * Ajout d'operation de calcul.
     * @param moteurRPN moteur d'exécution des actions.
     * @param operation caractere de l'opération arithmétique.
     */
    public void addOperation(final MoteurRPN moteurRPN, final char operation) {
        CommandeCalculation cmdOperation = new CommandeCalculation(moteurRPN, operation);
        if (commandTable.containsKey("calculation")) {
            cmdOperation = (CommandeCalculation) commandTable.get("calculation");
            cmdOperation.setOperator(operation);
        }

    }

    /**
     * Factory Method de l'action Register.
     * @param moteurRPN moteur exécutant les commandes
     * @param value valeur de l'opérande.
     */
    public void addValue(final MoteurRPN moteurRPN, final double value) {
      CommandeRegister cmdValue = new CommandeRegister(moteurRPN, value);
      if (commandTable.containsKey("register")) {
          cmdValue = (CommandeRegister) commandTable.get("register");
          cmdValue.setValue(value);
      }
    }



    /**
     * Factory Method de commande.
     * @param moteurRPN moteur d'exécution de commandes.
     * @return commandFactory Objet regroupant les actions de la calculatrice.
     */
    public CommandeFactory createSession(final MoteurRPN moteurRPN) {
        CommandeFactory commandFactory = new CommandeFactory();
        commandFactory.addCommand("undo", new CommandeUndo(moteurRPN));
        commandFactory.addCommand("exit", new CommandeExit(moteurRPN));
        commandFactory.addCommand("result", new CommandeResult(moteurRPN));
        commandFactory.addCommand("register", new CommandeRegister(moteurRPN, 0.0));
        commandFactory.addCommand("calculation", new CommandeCalculation(moteurRPN, '-'));
        commandFactory.addCommand("empty", new CommandeEmpty(moteurRPN));
      return commandFactory;
    }

    /**
     * Factory Method d'execution de commande.
     * @param commandName nom de la commande à ajouter.
     */
    public void execute(final String commandName) {
        if (commandTable.containsKey(commandName)) {
            try {
                commandTable.get(commandName).apply();
                commandTable.get("result").apply();
            } catch (DivisionNullException div) {
                div.printStackTrace();
            }

        }
    }


}
