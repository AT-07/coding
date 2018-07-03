package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * unit test for the class TestSpinWords.
 */

public class TestSpinWords {
    private SpinWords spin;

    /**
     * Init of variables.
     */
    @Before
    public void before() {
        spin = new SpinWords();


    }


    /**
     * test for validation of testSpinWordsSpinWordsPass.
     */

    @Test
    public void testSpinWordsSpinWordsPass() {
        final String value = "Welcome";
        final String value1 = "Hey fellow warriors";
        assertEquals("emocleW", spin.stopSpinWords(value));
        assertEquals("Hey wollef sroirraw", spin.stopSpinWords(value1));
    }

    /**
     * test for validation of testSpinWordsSpinWordsFails.
     */

    @Test
    public void testSpinWordsSpinWordsFails() {
        final String valueFail = "Hey fellow warriors";
        final String valueFail1 = "hi";
        assertNotEquals("Hey wolle sroirraw", spin.stopSpinWords(valueFail));
        assertNotEquals("ih", spin.stopSpinWords(valueFail1));
    }

}
