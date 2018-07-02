package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        final String expectedResult = "La lapicnirp noisim de cada uno es rednerpa cada dia mas";
        assertEquals(expectedResult, spinWord.spinWords(cadenaValue));
    }

    /**
     * Test N°2 to validate the correctness of the spinWords method.
     */
    @Test
    public void spinWordsTest2Correct() {
        String cadenaValue = "Las musica debe traer alivio al alma y la mente";
        final String expectedResult = "Las acisum debe reart oivila al alma y la etnem";
        assertEquals(expectedResult, spinWord.spinWords(cadenaValue));
    }
}
