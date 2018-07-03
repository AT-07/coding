package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * class SpinWordsTest it is test verify.
 */

public class SpinWordsTest {
    private SpinWords spinWord;


    /**
     * this is method execute firth.
     */
    @Before
    public void before() {

        spinWord = new SpinWords();
    }

    /**
     * it test is verify that a string is Spin Word.
     */
    @Test
    public void testGetSprintWordPass() {
        final String phraseN = "hey fellow warriors";
        final String phraseCorrectly = "hey wollef sroirraw";


        assertTrue(phraseCorrectly.equals(spinWord.getSpinWord(phraseN)));


    }

    /**
     * it test verify that a string add is not Spin Word.
     */

    @Test
    public void testGetSprintWordFailed() {
        final String phraseN = "hey fellow warriors";

        final String phaseFalse = "hey wollef warriors";

        assertFalse(phaseFalse.equals(spinWord.getSpinWord(phraseN)));
    }

}
