package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this a test for class WordOrder.
 */
public class WordOrderTest {
    private WordOrder wordOrder;

    /**
     * this method initialize instance of class.
     */
    @Before
    public void setUp() {
        wordOrder = new WordOrder();
    }

    /**
     * test to inner content descending "wait for me".
     */
    @Test
    public void innerContent() {
        String sentence = wordOrder.innerContent("wait for me");
        assertEquals("wiat for me", sentence);
    }

    /**
     * test to inner content descending "sort the inner content in descending order".
     */
    @Test
    public void innerContentSentenceTwo() {
        String sentence = wordOrder.innerContent("sort the inner content in descending order");
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sentence);
    }

    @Test
    public void innerContentSentenceThree() {
        String sentence = wordOrder.innerContent("I am");
        assertEquals("I am", sentence);
    }
}
