package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test that verifies if the characters of the inner part of a word are ordered in descending order.
 */
public class TestSortInnerContent {
    private SortInnerContent inner;

    /**
     * Constructor of the class SortInnerContent.
     */
    @Before
    public void setUp() {
        inner = new SortInnerContent();
    }

    /**
     * Test that verifies if the internal part of a word is ordered.
     */
    @Test
    public void testInvDescUnaPalabra() {
        String invDesc = inner.innerContent("sort");
        assertEquals("srot", invDesc);
    }

    /**
     * Test that verifies if the internal part of two word is ordered.
     */
    @Test
    public void testInvDescDosPalabras() {
        String invDesc = inner.innerContent("sort the");
        assertEquals("srot the", invDesc);
    }

    /**
     * Test that verifies if the internal part of a String is ordered.
     */
    @Test
    public void testInvDescVariasPalabras() {
        String invDesc = inner.innerContent("sort inner content");
        assertEquals("srot inner ctonnet", invDesc);
    }

    /**
     * Test that verifies if the internal part of a string of three caracteres or.
     * minus each words is ordered.
     */
    @Test
    public void testInvDescPalabrasPequenia() {
        String invDesc = inner.innerContent("the mon is big");
        assertEquals("the mon is big", invDesc);
    }

    /**
     * Test that verifies if the internal part of a string of three caracteres or.
     * more each words is ordered.
     */
    @Test
    public void testInvDescPalabrasCombinadas() {
        String invDesc = inner.innerContent("go to settings to activate windows");
        System.out.println(invDesc);
        assertEquals("go to sttniges to avtticae wwonids", invDesc);
    }
}
