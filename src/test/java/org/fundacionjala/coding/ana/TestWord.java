package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class TestWord {
    private Word invertWord;

    /**
     * call to class Word.
     */
    @Before
    public void setUp() {
        invertWord = new Word();
    }

    /**
     * test for invert the word.
     */
    @Test
    public void tesTestWordInvertWordCompareto() {
        assertEquals("hey wollef sroirraw", invertWord.stringWords("hey fellow warriors"));
    }

    /**
     * test for no invert the word.
     */
    @Test
    public void tesTestWordNoInvertWord() {
        assertEquals("this is a test", invertWord.stringWords("this is a test"));
    }

    /**
     * test for into empty.
     */
    @Test
    public void tesTestWordInvertWordEmpty() {
        assertEquals("", invertWord.stringWords(""));
    }

}
