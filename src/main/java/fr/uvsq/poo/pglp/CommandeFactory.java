package fr.uvsq.poo.pglp;

import java.util.Hashtable;

public class CommandeFactory {
    /**
     * Hashtable des commandes avec pour clé le nom de la commande
     */
    private final Hashtable<String,ICommande> commandTable;

    public CommandeFactory(){
        commandTable = new Hashtable<>();
    }
    public void addCommand(String commandName,ICommande command){
        commandTable.put(commandName,command);
    }
    public void addOperation(char operation){
        CommandeCalculation cmdOperation;
        if(commandTable.containsKey("calculation")){
            cmdOperation = (CommandeCalculation) commandTable.get("calculation");
            cmdOperation.setOperator(operation);
        }

    }

    public void addValue(double value){
      CommandeRegister cmdValue;
      if(commandTable.containsKey("register")){
          cmdValue = (CommandeRegister) commandTable.get("register");
          cmdValue.setValue(value);
      }
    }

    public CommandeFactory createSession(MoteurRPN moteur){
        CommandeFactory commandFactory = new CommandeFactory();
        commandFactory.addCommand("undo",new CommandeUndo(moteur));
        commandFactory.addCommand("exit",new CommandeExit(moteur));
        commandFactory.addCommand("register",new CommandeRegister(moteur,0.0));
        commandFactory.addCommand("calculation",new CommandeCalculation(moteur,'*'));
        commandFactory.addCommand("result",new CommandeResult(moteur));
      return commandFactory;
    }

    public void execute(String commandName){
        if(commandTable.containsKey(commandName)){
            commandTable.get(commandName).apply();
        }
    }


}
