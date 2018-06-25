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
    private String value;
    private String value1;
    private String valueFail;
    private String valueFail1;

    /**
     * Init of variables.
     */
    @Before
    public void before() {
        spin = new SpinWords();
        value = "Welcome";
        value1 = "Hey fellow warriors";
        valueFail = "Hey fellow warriors";
        valueFail1 = "hi";
    }


    /**
     * test for validation of testSpinWordsSpinWordsPass.
     */

    @Test
    public void testSpinWordsSpinWordsPass() {
        assertEquals("emocleW", spin.stopSpinWords(value));
        assertEquals("Hey wollef sroirraw", spin.stopSpinWords(value1));
    }

    /**
     * test for validation of testSpinWordsSpinWordsFails.
     */

    @Test
    public void testSpinWordsSpinWordsFails() {
        assertNotEquals("Hey wolle sroirraw", spin.stopSpinWords(valueFail));
        assertNotEquals("ih", spin.stopSpinWords(valueFail1));
    }

}
