package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class DigitalTest {
    private Digital di;

    /**
     *before .
     */
    @Before
    public void before() {
        di = new Digital();

    }

    /**
     * prueba con dos digitos.
     */
    @Test
    public void testDigitalTwoNumber() {
        final int valueinput = 16;
        final int valuesexpext = 7;
        assertEquals(valuesexpext, di.root(valueinput));
    }

    /**
     * prueba con tres digitos.
     */
    @Test
    public void testDigitalThreeNumber() {
        final int valueinput = 942;
        final int valuesexpext = 6;
        assertEquals(valuesexpext, di.root(valueinput));
    }

    /**
     * prueba con seis digitos.
     */
    @Test
    public void testDigitalSixNumber() {
        final int valueinput = 132189;
        final int valuesexpext = 6;
        assertEquals(valuesexpext, di.root(valueinput));
    }
}
