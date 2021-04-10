package fr.uvsq.poo.pglp;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.assertTrue;

public class CommandeExitTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void systemExitWithStatusCodeZeroTest(){
        Interpreteur interpreteurTest = new Interpreteur();
        CommandeExit cmdExit = new CommandeExit(interpreteurTest);
        exit.expectSystemExitWithStatus(0);
        cmdExit.apply();
    }
}
