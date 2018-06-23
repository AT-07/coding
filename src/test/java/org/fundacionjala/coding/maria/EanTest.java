package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
     * checking is true.
     */
    @Test
    public void testEanArticleNumberTrue() {
        boolean resul = ean.articleNumber("4003301018398");
        assertEquals(true, resul);

    }

    /**
     * checking is false.
     */
    @Test
    public void testEanArticleNumberFalse() {
        boolean resul = ean.articleNumber("4003301018392");
        assertEquals(false, resul);

    }
}

