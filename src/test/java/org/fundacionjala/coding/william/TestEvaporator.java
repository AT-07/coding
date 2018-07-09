package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class that executes all the Unit Tests of my Evaporator class.
 */
public class TestEvaporator {

    private Evaporator evaporator;

    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void inicialization() {
        evaporator = new Evaporator();
    }

    /**
     * Test that guarantees the correctness of the evaporator method.
     */
    @Test
    public void evaporatorTestCorrect() {
        final int countMl = 10;
        final int percentageLost = 10;
        final int thresholdPercentage = 10;
        final int resultExpected = 22;
        assertEquals(resultExpected, evaporator.evaporator(countMl, percentageLost, thresholdPercentage));
    }

    /**
     * Test that guarantees the correctness of the evaporator method.
     */
    @Test
    public void evaporatorTest2Correct() {
        final int countMl = 40;
        final int percentageLost = 15;
        final int thresholdPercentage = 8;
        final int resultExpected = 16;
        assertEquals(resultExpected, evaporator.evaporator(countMl, percentageLost, thresholdPercentage));
    }

    /**
     * Test that guarantees the correctness of the evaporator method with erroneous expected result.
     */
    @Test
    public void evaporatorTestIncorrect() {
        final int countMl = 50;
        final int percentageLost = 12;
        final int thresholdPercentage = 18;
        final int resultExpected = 13;
        assertNotEquals(resultExpected, evaporator.evaporator(countMl, percentageLost, thresholdPercentage));
    }
}
