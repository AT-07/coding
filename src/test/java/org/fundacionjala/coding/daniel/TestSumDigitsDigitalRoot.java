package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests to verify the sum of digits until having a single digit number.
 */
public class TestSumDigitsDigitalRoot {
    private SumDigitsDigitalRoot sumaDigito;

    /**
     * Initialize constructor.
     */
    @Before
    public void setUp() {
        sumaDigito = new SumDigitsDigitalRoot();
    }

    /**
     * Test that will verify when the input parameter is a digit .
     */
    @Test
    public void testSumatoriaDeUnDigitos() {
        final int expectedResult = 9;
        final int digitalResult = 9;
        int sumaObtenida = sumaDigito.sumarNumero(digitalResult);
        assertEquals(expectedResult, sumaObtenida);
    }

    /**
     * Test that will verify when the input parameter has two digits.
     */
    @Test
    public void testSumatoriaUnDigito() {
        final int rxpectedResult = 1;
        final int digitalResult = 55;
        int sumaObtenida = sumaDigito.sumarNumero(digitalResult);
        assertEquals(rxpectedResult, sumaObtenida);
    }

    /**
     * Test that will verify when the input parameter has three digits.
     */
    @Test
    public void testSumatoriaTresDigitos() {
        final int expectedResult = 6;
        final int digitalResult = 942;
        int sumaObtenida = sumaDigito.sumarNumero(digitalResult);
        assertEquals(expectedResult, sumaObtenida);
    }

    /**
     * Test that will verify when the input parameter has n digits.
     */
    @Test
    public void testSumatoriaNDigitos() {
        final int expectedResult = 6;
        final int digitalResult = 132189;
        int sumaObtenida = sumaDigito.sumarNumero(digitalResult);
        assertEquals(expectedResult, sumaObtenida);
    }
}
