package fr.uvsq.poo.pglp;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class CommandeResultTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void printStackTest(){
        MoteurRPN moteurTest = new MoteurRPN();
        moteurTest.register(-100.0);
        moteurTest.register(8.54);
        moteurTest.register(-45.4);
        moteurTest.register(60.0);
        CommandeResult cmdRes = new CommandeResult(moteurTest);
        cmdRes.apply();
        String valeur = "|-100.0, 8.54, -45.4, 60.0|<- head\n";
        assertEquals(outContent.toString(),valeur);
    }
}
