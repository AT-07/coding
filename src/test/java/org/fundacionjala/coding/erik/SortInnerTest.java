package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is the class test.
 */
public class SortInnerTest {
    private SortInner words;
    private String actual = "sort the inner content in descending order";
    private String expected = "srot the inner ctonnet in dsnnieedcg oredr";
    private String actual1 = "wait for me";
    private String expected1 = "wiat for me";
    private String actual2 = "this kata is easy";
    private String expected2 = "tihs ktaa is esay";

    /**
     * this method init.
     */
    @Before
    public void before() {
        words = new SortInner();
    }

    /**
     * this test is to validate string content in descending order.
     */
    @Test
    public void exampleTests() {
        assertEquals(expected, words.sortTheInnerContent(actual));
        assertEquals(expected1, words.sortTheInnerContent(actual1));
        assertEquals(expected2, words.sortTheInnerContent(actual2));
    }
}
