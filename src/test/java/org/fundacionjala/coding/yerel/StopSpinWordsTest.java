package org.fundacionjala.coding.yerel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test of StopSpinWords.
 */
public class StopSpinWordsTest {

    /**
     * this test assert "Hey wollef sroirraw".
     */
    @Test
    public void spinWords() {
        StopSpinWords stopSpinWords = new StopSpinWords();
        String words = stopSpinWords.spinWords("Hey fellow warriors");
        assertEquals("Hey wollef sroirraw", words);
    }

    /**
     * this test assert "Hey wollef sroirraw".
     */
    @Test
    public void spinWordswordTwo() {
        StopSpinWords stopSpinWords = new StopSpinWords();
        String words = stopSpinWords.spinWords("This is a test");
        assertEquals("This is a test", words);
    }

    /**
     * this test assert "This is rehtona test".
     */
    @Test
    public void spinWordswordThree() {
        StopSpinWords stopSpinWords = new StopSpinWords();
        String words = stopSpinWords.spinWords("This is another test");
        assertEquals("This is rehtona test", words);
    }

    /**
     * this test assert "la casa es ednarg".
     */
    @Test
    public void spinWordswordFour() {
        StopSpinWords stopSpinWords = new StopSpinWords();
        String words = stopSpinWords.spinWords("la casa es grande");
        assertEquals("la casa es ednarg", words);
    }

    /**
     * this test assert "la casa".
     */
    @Test
    public void spinWordswordFive() {
        StopSpinWords stopSpinWords = new StopSpinWords();
        String words = stopSpinWords.spinWords("la casa");
        assertEquals("la casa", words);
    }
}
