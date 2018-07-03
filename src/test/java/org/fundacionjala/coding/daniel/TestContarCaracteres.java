package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test that verifies how many times a character is repeated in a string.
 */
public class TestContarCaracteres {

    private ContarCaracteres contar;

    /**
     * definition constructor of the CountCharacters.
     */
    @Before
    public void setUp() {
        contar = new ContarCaracteres();
    }

    /**
     * Check how many times the character 'z' in the chain is repeated.
     */
    @Test
    public void testRepiteCaracteres() {
        final int expectedResult = 4;
        int actualResult = contar.contarCaracter("fizzbuzz", 'z');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * check how many times the character 'a' in the chain is repeated.
     */
    @Test
    public void testNingunCaracterIgual() {
        final int expectedResult = 0;
        int actualResult = contar.contarCaracter("fizzbuzz", 'a');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * check how many times the character 'u' in the chain is repeated.
     */
    @Test
    public void testRepiteUnCaracter() {
        final int expectedResult = 1;
        int actualResult = contar.contarCaracter("fizzbuzz", 'u');
        assertEquals(expectedResult, actualResult);
    }
}
