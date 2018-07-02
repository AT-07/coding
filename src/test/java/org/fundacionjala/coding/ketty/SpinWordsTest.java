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
    private static final String PHRASE_N = "hey fellow warriors";
    private static final String PHRASE_CORRECTLY = "hey wollef sroirraw";
    private static final String PHASE_FALSE = "hey wollef warriors";

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


        assertTrue(PHRASE_CORRECTLY.equals(spinWord.getSpinWord(PHRASE_N)));


    }

    /**
     * it test verify that a string add is not Spin Word.
     */

    @Test
    public void testGetSprintWordFailed() {

        assertFalse(PHASE_FALSE.equals(spinWord.getSpinWord(PHRASE_N)));
    }

}
