package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class PersistenceTest {
    private Persistence per;

    /**
     * asignando valores a variables para que pasen como prueba.
     */
    @Before
    public void before() {
        per = new Persistence();
    }

    /**
     * prueba con numero de dos digitos.
     */
    @Test
    public void testPersistenceUnValor() {
        final int prueba1 = 39;
        final int asigna = 3;
        assertEquals(asigna, per.persistance(prueba1));
    }

    /**
     * prueba con numero de tres digitos.
     */
    @Test
    public void testPersistenceValor() {
        final int prueba2 = 999;
        final int asigna2 = 4;
        assertEquals(asigna2, per.persistance(prueba2));
    }

    /**
     * prueba con numero de un digitos.
     */
    @Test
    public void testPersistenceUnDigito() {
        final int prueba3 = 4;
        assertEquals(0, per.persistance(prueba3));
    }
}
