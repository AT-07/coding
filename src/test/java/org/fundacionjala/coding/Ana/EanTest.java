package org.fundacionjala.coding.Ana;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * goods have an International Article Number.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class EanTest {
    private Ean ean;

    /**
     * pruebas antes.
     *
     * @throws Exception antes.
     */
    @Before
    public void setUp() {
        ean = new Ean();
    }

    /**
     * comprobando se es true.
     */
    @Test
    public void testEanArticleNumberTrue() {
        boolean resul = ean.articleNumber("4003301018398");
        //  boolean resul = ean.articleNumber("0012345678905");
        assertEquals(true, resul);
        System.out.print(resul);

    }

    /**
     * comprobar si es false.
     */
    @Test
    public void testEanArticleNumberFalse() {
        boolean resul = ean.articleNumber("4003301018392");
        assertEquals(false, resul);
        System.out.print(resul);

    }

}
