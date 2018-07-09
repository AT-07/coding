package org.fundacionjala.coding.denis;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEvaporation {

    private Evaporation evaporator;

    /**
     * this method init the object.
     */
    @Before
    public void before() {
        evaporator = new Evaporation();
    }

    /**
     * this test is of method test Evaporation.
     */
    @Test
    public void testEvaporationPass() {
        final double ten = 10;
        final int expected = 22;
        assertEquals(expected, evaporator.evaporation(ten, ten, ten));
    }
}
