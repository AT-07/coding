package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Pruebas para verificar el funcionamieto de sumar digitos.
 */
public abstract class TestSumDigitsDigitalRoot {
    private SumDigitsDigitalRoot sumaDigito;

    private static final int PRUEBA1 = 9;
    private static final int PRUEBA2 = 6;
    private static final int PRUEBA3 = 942;
    private static final int PRUEBA4 = 24;
    private static final int PRUEBA5 = 132189;

    /**
     * inicializaremos nuestro constructos sumaDigito.
     */
    @Before
    public void setUp() {
        sumaDigito = new SumDigitsDigitalRoot();
    }

    /**
     * test que verificara la sumatoria de un digito hasta tener un solo digito.
     */
    @Test
    public void testSumatoriaDeUnDigitos() {
        int sumaEsperada = sumaDigito.sumarSecuenciaDigito(PRUEBA1);
        assertEquals(PRUEBA1, sumaEsperada);
    }

    /**
     * test que verificara la sumatoria de dos digito hasta tener un solo digito.
     */
    @Test
    public void testSumatoriaDeDosDigitos() {
        int sumaEsperada = sumaDigito.sumarSecuenciaDigito(PRUEBA3);
        assertEquals(PRUEBA2, sumaEsperada);
    }

    /**
     * test que verificara la sumatoria de tres digito hasta tener un solo digito.
     */
    @Test
    public void testSumatoriaDeTresDigitos() {
        int sumaEsperada = sumaDigito.sumarSecuenciaDigito(PRUEBA5);
        assertEquals(PRUEBA2, sumaEsperada);
    }

    /**
     * test que verificara la sumatoria de seis digito.
     */
    @Test
    public void testSumatoria() {
        int sumaEsperada = sumaDigito.sumarNumero(PRUEBA5);
        assertEquals(PRUEBA4, sumaEsperada);
    }

}
