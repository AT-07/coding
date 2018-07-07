package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test that verifies the life time in days of a DeodorantEvaporator.
 * applying rule of three and subtracting the total content.
 * the results also depend on our daily gas loss and the threshold.
 */
public class TestDeodorantEvaporator {
    private static final double GASUMBRAL = 10;
    private DeodorantEvaporator evaporator;

    /**
     * Constructor of our class DeodoranteEvaporator.
     */
    @Before
    public void setUp() {
        evaporator = new DeodorantEvaporator();
    }

    /**
     * Test that verify the time of live of our Deodorante.
     * since our content of our deodorant is equal to 100 (full).
     */
    @Test
    public void testEvaporatorFull() {
        final double contenido = 100;
        final int expectedResult = 22;
        int actualResult = evaporator.deodorantEvaporator(contenido, GASUMBRAL, GASUMBRAL);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test that verify the time of live of our Deodorante.
     * since our content of our deodorant is equal to 50.
     */
    @Test
    public void testEvaporatorMedium() {
        final double contenido = 50;
        final int expectedResult = 16;
        int actualResult = evaporator.deodorantEvaporator(contenido, GASUMBRAL, GASUMBRAL);
        assertEquals(expectedResult, actualResult);
    }
}
