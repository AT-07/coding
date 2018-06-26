package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test of StopSpinWords.
 */
public class StopSpinWordsTest {

    private StopSpinWords stopSpinWords;

    /**
     * instance of StopSpinWords for use in Junit.
     */
    @Before
    public void setUp() {
        stopSpinWords = new StopSpinWords();
    }

    /**
     * this test assert "Hey wollef sroirraw".
     */
    @Test
    public void spinWords() {
        String words = stopSpinWords.spinWords("Hey fellow warriors");
        assertEquals("Hey wollef sroirraw", words);
    }

    /**
     * this test assert "Hey wollef sroirraw".
     */
    @Test
    public void spinWordswordTwo() {
        String words = stopSpinWords.spinWords("This is a test");
        assertEquals("This is a test", words);
    }

    /**
     * this test assert "This is rehtona test".
     */
    @Test
    public void spinWordswordThree() {
        String words = stopSpinWords.spinWords("This is another test");
        assertEquals("This is rehtona test", words);
    }

    /**
     * this test assert "la casa es ednarg".
     */
    @Test
    public void spinWordswordFour() {
        String words = stopSpinWords.spinWords("la casa es grande");
        assertEquals("la casa es ednarg", words);
    }

    /**
     * this test assert "la casa".
     */
    @Test
    public void spinWordswordFive() {
        String words = stopSpinWords.spinWords("la casa");
        assertEquals("la casa", words);
    }
}
