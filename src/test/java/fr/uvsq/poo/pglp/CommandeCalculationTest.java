package fr.uvsq.poo.pglp;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class CommandeCalculationTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void divisionByZeroTest() throws DivisionNullException {
        MoteurRPN moteurTest = new MoteurRPN();
        moteurTest.register(5);
        moteurTest.register(0);
        CommandeCalculation cmdCalcul = new CommandeCalculation(moteurTest,'/');
        expectedEx.expect(DivisionNullException.class);
        expectedEx.expectMessage("Can't divide by zero!");
        cmdCalcul.apply();
    }

    @Test
    public void additionSixAndTwoTest() throws DivisionNullException {
       MoteurRPN moteurTest = new MoteurRPN();
       moteurTest.register(2.0);
       moteurTest.register(6.0);
       CommandeCalculation cmdCalcul = new CommandeCalculation(moteurTest,'+');
       cmdCalcul.apply();
        assertEquals("[8.0]", cmdCalcul.getMrpn().result().toString());
    }
    @Test
    public void substractionNineAndFifteenTest() throws DivisionNullException {
        MoteurRPN moteurTest = new MoteurRPN();
        moteurTest.register(15.0);
        moteurTest.register(9.0);
        CommandeCalculation cmdCalcul = new CommandeCalculation(moteurTest,'-');
        cmdCalcul.apply();
        assertEquals("[-6.0]", cmdCalcul.getMrpn().result().toString());
    }

    @Test
    public void multiplicationFourAndZero() throws DivisionNullException {
        MoteurRPN moteurTest = new MoteurRPN();
        moteurTest.register(0.0);
        moteurTest.register(4.0);
        CommandeCalculation cmdCalcul = new CommandeCalculation(moteurTest,'*');
        cmdCalcul.apply();
        assertEquals("[0.0]", cmdCalcul.getMrpn().result().toString());
    }
}
