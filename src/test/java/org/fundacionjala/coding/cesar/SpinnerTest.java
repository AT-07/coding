package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class SpinnerTest {
    private Spinner cam;

    /**
     *Initiating before.
     */
    @Before
    public void before() {
        cam = new Spinner();
    }

    /**
     * Test with string.
     */
    @Test
    public void testValidarPass() {
        String prueba1 = "This is another test";
        assertEquals("This is rehtona test", cam.spinWords(prueba1));
    }

    /**
     * String from 4 letters.
     */
    @Test
    public void testValidarMenor() {
        String prueba1 = "hola como esta";
        assertEquals("hola como esta", cam.spinWords(prueba1));
    }

    /**
     * String fron one letters.
     */
    @Test
    public void testValidarUno() {
        String prueba1 = "a";
        assertEquals("a", cam.spinWords(prueba1));
    }


}
