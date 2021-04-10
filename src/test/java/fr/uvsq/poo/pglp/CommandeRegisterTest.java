package fr.uvsq.poo.pglp;



import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CommandeRegisterTest {
    @Test
    public void setValueFiftyTest(){
        MoteurRPN moteurTest = new MoteurRPN();
        double value = 50.0;
        CommandeRegister cmdRegister = new CommandeRegister(moteurTest,50.0);
        cmdRegister.apply();
        assertEquals(cmdRegister.getValue(),value,0.01);
    }

    @Test
    public void setPileWithMinusTenValueTest(){
        MoteurRPN moteurTest = new MoteurRPN();
        CommandeRegister cmdRegister = new CommandeRegister(moteurTest,-10.0);
        cmdRegister.apply();
        assertEquals("[-10.0]", cmdRegister.getMoteurRPN().result().toString());
    }

}
