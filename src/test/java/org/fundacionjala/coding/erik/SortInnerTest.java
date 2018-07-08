package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is the class test.
 */
public class SortInnerTest {
    private SortInner words;

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
        final String actual = "sort the inner content in descending order";
        final String expected = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expected, words.sortTheInnerContent(actual));

    }

    /**
     *
     */
    @Test
    public void exampleTests1() {
        final String actual1 = "wait for me";
        final String expected1 = "wiat for me";
        assertEquals(expected1, words.sortTheInnerContent(actual1));
    }
    /**
     *
     */
    @Test
    public void exampleTests2() {
        final String actual2 = "this kata is easy";
        final String expected2 = "tihs ktaa is esay";
        assertEquals(expected2, words.sortTheInnerContent(actual2));
    }
}
