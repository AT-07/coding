package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class for  validate spin words.
 */
public class SpinWordTest {

    private SpinWord spinWord;

    /**
     * this is a constructor.
     */
    @Before
    public void ini() {
        spinWord = new SpinWord();
    }

    /**
     * test for validate spin word.
     */
    @Test
    public void test() {
        assertEquals("emocleW", spinWord.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
    }
}
