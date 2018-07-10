package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaporatorTest {
    private Evaporator ep;

    /**
     * initialize before.
     */
    @Before
    public void before() {
        ep = new Evaporator();
    }

    /**
     * Test from value.
     */
    @Test
    public void testEvaporatorOne() {
        final double contenido = 10;
        final double porcentaje = 10;
        final double umbral = 10;
        final int expectedoutput = 22;
        assertEquals(expectedoutput, ep.evaporador(contenido, porcentaje, umbral));
    }
}
