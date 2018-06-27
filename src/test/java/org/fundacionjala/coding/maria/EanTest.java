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
        boolean result = ean.articleNumber("4003301018398");
        assertEquals(true, result);
    }

    /**
     * checking is false.
     */
    @Test
    public void testEanArticleNumberFalse() {
        boolean result = ean.articleNumber("4003301018392");
        assertEquals(false, result);
    }

    /**
     * checking is Zero.
     */
    @Test
    public void testEanArticleNumberZero() {
        boolean result = ean.articleNumber("9783827317100");
        assertEquals(true, result);
    }
}

