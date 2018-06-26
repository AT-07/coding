package org.fundacionjala.coding.testspinwords;

import org.fundacionjala.coding.spinwords.SpinWords;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class where all the tests of the SpinWords class will be executed.
 */
public class TestSpinWords {

    private SpinWords spinWord;

    /**
     * Test to initialize my object.
     */
    @Before
    public void inicialization() {
        spinWord = new SpinWords();
    }

    /**
     * Test to validate the correctness of the spinWords method.
     */
    @Test
    public void spinWordsTest1Correct() {
        final String cadenaValue = "La principal mision de cada uno es aprender cada dia mas";
        String cadenaModified = spinWord.spinWords(cadenaValue);
        assertEquals(cadenaModified, spinWord.spinWords(cadenaValue));
    }

    /**
     * Test N°2 to validate the correctness of the spinWords method.
     */
    @Test
    public void spinWordsTest2Correct() {
        final String cadenaValue = "Las matemáticas son la música de la razón";
        String cadenaModified = spinWord.spinWords(cadenaValue);
        assertEquals(cadenaModified, spinWord.spinWords(cadenaValue));
    }

    /**
     * Test to validate the correctness of the spinWords method.
     */
    @Test
    public void spinWordsTestIncorrect() {
        String cadenaValue = "Las musica debe traer alivio al alma y la mente";
        assertNotEquals(cadenaValue, spinWord.spinWords(cadenaValue));
    }
}
