package org.fundacionjala.coding.testpersistence;

import org.fundacionjala.coding.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Clase TestPersistence que ayuda a correr todos los casos de prueba de la clase Persistence.
 */
public class TestPersistence {
    private Persistence persistence;
    private static final int CONSTANTE1 = 39;
    private static final int CONSTANTE2 = 3;
    private static final int CONSTANTE3 = 999;
    private static final int CONSTANTE4 = 4;
    private static final int CONSTANTE5 = 1;
    private static final int CONSTANTE7 = 27;


    /**
     * Metodo que inicializa mi objeto persistence.
     */
    @Before
    public void inicializacion() {
        persistence = new Persistence();
    }

    /**
     * Unit Test #1 que verifica la correctitud del metodo persistence.
     */
    @Test
    public void numberPersistentTest1True() {
        assertTrue(persistence.persistence(CONSTANTE1) == CONSTANTE2);

    }

    /**
     * Unit Test #2 que verifica la correctitud del metodo persistence.
     */
    @Test
    public void numberPersistentTest2True() {
        assertTrue(persistence.persistence(CONSTANTE3) == CONSTANTE4);

    }

    /**
     * Unit Test #3 que verifica la correctitud del metodo persistence.
     */
    @Test
    public void numberPersistentTest3True() {
        assertTrue(persistence.persistence(CONSTANTE5) == 0);

    }

    /**
     * Unit Test #4 que verifica la correctitud del metodo persistence con valores erroneos.
     */
    @Test
    public void numberPersistentTestFalse() {
        assertFalse(persistence.persistence(CONSTANTE3) == CONSTANTE2);
    }

    /**
     * Unit Test #1 que verifica la correctitud del metodo multiplication.
     */
    @Test
    public void multiplicationTest1True() {
        assertTrue(persistence.multiplication(CONSTANTE1) == CONSTANTE7);

    }

    /**
     * Unit Test #1 que verifica la correctitud del metodo multiplication.
     */
    @Test
    public void multiplicationTest2False() {
        assertFalse(persistence.multiplication(CONSTANTE1) == CONSTANTE2);
    }
}
