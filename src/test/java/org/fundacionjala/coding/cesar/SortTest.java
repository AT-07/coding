package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class SortTest {

    private Sort so;

    /**
     * declaron las variables para entren por el metodo de invertir.
     */
    @Before
    public void before() {
        so = new Sort();

    }

    /**
     * prueba con cadena larga.
     */
    @Test
    public void testSortTheInnerContentVariosC() {
        final String prueba1 = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", so.sortTheInnerContent(prueba1));
    }

    /**
     * prueba con la cadena mas corta.
     */
    @Test
    public void testSortTheInnerContentVariosCorta() {
        final String prueba2 = "wait for me";
        assertEquals("wiat for me", so.sortTheInnerContent(prueba2));
    }

    /**
     *prueba con cadena .
     */
    @Test
    public void testSortTheInnerContentVariosCorto() {
        final String prueba3 = "this kata is easy";
        assertEquals("tihs ktaa is esay", so.sortTheInnerContent(prueba3));
    }

    /**
     *
     * test with a short chain.
     */
    @Test
    public void testSortTheInnerContentVaalueShort() {
        final String prueba4 = "I am";
        assertEquals("I am", so.sortTheInnerContent(prueba4));
    }
}
