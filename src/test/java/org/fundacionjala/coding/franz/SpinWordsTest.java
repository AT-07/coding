package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class is a test of class SpinWord.
 */
public class SpinWordsTest {
    private SpinWords spin;

    /**
     * this method initialize the object SpinWords.
     */
    @Before
    public void ini() {
        spin = new SpinWords();
    }

    /**
     * this is a test for a method.
     */
    @Test
    public void testSpinWord() {
        assertEquals("emocleW", spin.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spin.spinWords("Hey fellow warriors"));
        assertEquals("is a tes", spin.spinWords("is a tes"));
        assertEquals("ylsuoireS", spin.spinWords("Seriously"));

    }
}
