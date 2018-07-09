package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * test of class DescendingOrder.
 */

public class DescendingOrderTest {

    private DescendingOrder descending;

    /**
     * first execute of method.
     */
    @Before
    public void before() {
        descending = new DescendingOrder();
    }

    /**
     * test verify that  string "sort the inner content in descending order" is pass.
     */

    @Test
    public void descendingOrderTestPass() {
        String text = "sort the inner content in descending order";
        String expected = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expected, descending.descendingOrder(text));

    }

    /**
     * test verify that  string "sort the inner content in descending order" ,it is not pass.
     */
    @Test
    public void descendingOrderTestFailed() {
        String text = "sort the inner content in descending order";
        String expected = "srot the inner ctonn in dsnnieedcg oredr";
        assertNotEquals(expected, descending.descendingOrder(text));

    }

    /**
     * test verify that String "wait for me" pass.
     */
    @Test
    public void descendingOrderTestPass1() {
        String text = "wait for me";
        String expected = "wiat for me";
        assertEquals(expected, descending.descendingOrder(text));

    }

    /**
     * test verify that String "wait for me",it is not pass.
     */
    @Test
    public void descendingOrderTestFailed1() {
        String text = "wait for me";
        String expected = "waat for me";
        assertNotEquals(expected, descending.descendingOrder(text));

    }
}
