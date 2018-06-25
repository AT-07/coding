package org.fundacionjala.coding;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class SortTest {
    /**
     * hola.
     */
    private Sort so;
    private String prueba1;
    private String prueba2;
    private String prueba3;


    /**
     * declaron las variables para entren por el metodo de invertir.
     */
    @Before
    public void before() {
        so = new Sort();
        prueba1 = "sort the inner content in descending order";
        prueba2 = "wait for me";
        prueba3 = "this kata is easy";
    }

    /**
     * prueba con cadena larga.
     */
    @Test
    public void testSortTheInnerContentVariosC() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", so.sortTheInnerContent(prueba1));
    }

    /**
     * prueba con la cadena mas corta.
     */
    @Test
    public void testSortTheInnerContentVariosc() {
        assertEquals("wiat for me", so.sortTheInnerContent(prueba2));
    }

    /**
     *prueba con cadena .
     */
    @Test
    public void testSortTheInnerContentVariosCorto() {
        assertEquals("tihs ktaa is esay", so.sortTheInnerContent(prueba3));
    }
}
