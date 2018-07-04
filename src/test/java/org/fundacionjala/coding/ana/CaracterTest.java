package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class CaracterTest {
    private Caracter caracter;

    /**
     * llamada a la clase.
     */
    @Before
    public void setUp() {
        caracter = new Caracter();
    }

    /**
     * test the method charCount with z.
     */
    @Test
    public void testSomething() {
        final int expected = 4;
        assertEquals(expected, caracter.charCount("fizzbuzz", 'z'));
        assertEquals(expected, caracter.charCount("FIZZBUZZ", 'z'));
    }

}
