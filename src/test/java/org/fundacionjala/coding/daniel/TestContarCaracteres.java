package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test that verifies how many times a character is repeated in a string.
 */
public class TestContarCaracteres {
    private static final String CONTARCADENA = "fizzbuzz";
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
        int actualResult = contar.contarCaracter(CONTARCADENA, 'z');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * check how many times the character 'a' in the chain is repeated.
     */
    @Test
    public void testNingunCaracterIgual() {
        final int expectedResult = 0;
        int actualResult = contar.contarCaracter(CONTARCADENA, 'e');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * check how many times the character 'u' in the chain is repeated.
     */
    @Test
    public void testRepiteUnCaracter() {
        final int expectedResult = 1;
        int actualResult = contar.contarCaracter(CONTARCADENA, 'i');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Check how many times charatcer empty ' ' with a string that contains a space.
     */
    @Test
    public void testRepiteSpaceEmpty() {
        final int expectedResult = 1;
        int actualResult = contar.contarCaracter(" ", ' ');
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Check how many times the character 'f' is repeated in a string of several words.
     */
    @Test
    public void testRepiteEnUnaCadena() {
        final int expectedResult = 10;
        int actualResult = contar.contarCaracter("Fancy fifth fly aloof Fancy fifth fly aloof", 'f');
        assertEquals(expectedResult, actualResult);
    }
}
