package org.fundacionjala.coding.ana;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertTrue(ean.articleNumber("4003301018398"));
    }

    /**
     * checking is false.
     */
    @Test
    public void testEanArticleNumberFalse() {
        assertFalse(ean.articleNumber("4003301018392"));
    }

    /**
     * checking is Zero.
     */
    @Test
    public void testEanArticleNumberZero() {
        assertTrue(ean.articleNumber("9783827317100"));
    }
}

