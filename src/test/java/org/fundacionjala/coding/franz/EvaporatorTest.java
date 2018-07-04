package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a class of test.
 */
public class EvaporatorTest {
    private Evaporator evaporator;

    /**
     * this method initi first.
     */
    @Before
    public void ini() {
        evaporator = new Evaporator();
    }

    /**
     * this test is of method evaporator.
     */
    @Test
    public void testEvaporatorOne() {
        final double ten = 10;
        final int expected = 22;
        assertEquals(expected, evaporator.evaporator(ten, ten, ten));
    }
}
