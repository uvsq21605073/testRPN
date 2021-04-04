package fr.uvsq.poo.pglp;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
  @Test
  public void testApp() {
    assertTrue(true);
  }

  @Test
  public void testPile() {
    MoteurRPN M = new MoteurRPN();
    M.register(1);
    assertTrue(M.result().pop() == 1.0);
  }

  @Test
  public void testPlus() {
    MoteurRPN M = new MoteurRPN();
    M.register(2);
    M.register(6);
    M.calculation('+');
    assertTrue(M.result().pop() == 8.0);
  }
  @Test
  public void testMoins() {
    MoteurRPN M = new MoteurRPN();
    M.register(2);
    M.register(6);
    M.calculation('-');
    assertTrue(M.result().pop() == 4.0);
  }

  @Test
  public void testDivise() {
    MoteurRPN M = new MoteurRPN();
    M.register(2);
    M.register(6);
    M.calculation('/');
    assertTrue(M.result().pop() == 3.0);
  }

  @Test
  public void testFois() {
    MoteurRPN M = new MoteurRPN();
    M.register(2);
    M.register(6);
    M.calculation('*');
    assertTrue(M.result().pop() == 12.0);
  }

  @Test
  public void testSaisie() {
    assertTrue(true);
  }
}
