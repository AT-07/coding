package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a classTest.
 */
public class ShortInnerTest {
    private ShortInner shortInner;

    /**
     * this method run first.
     */
    @Before
    public void ini() {
        shortInner = new ShortInner();
    }

    /**
     * this method is a test of method sortTheInnerContent.
     */
    @Test
    public void testShortInnerIsShortInner() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                shortInner.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", shortInner.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", shortInner.sortTheInnerContent("this kata is easy"));
    }

}
