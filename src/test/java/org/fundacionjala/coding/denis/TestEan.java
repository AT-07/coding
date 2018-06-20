package org.fundacionjala.coding.denis;


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * unit test for the class Ean.
 */

public class TestEan {
    private Ean digits;

    /**
     * init.
     */
    @Before
    public void before() {
        digits = new Ean();
    }

    /**
     * test for validation of eanKataTrue.
     */
    @Test
    public void testEuropeArticleNumberKataPass() {
        digits.setDigits("4003301018398");
        assertTrue(digits.validation());
    }

    /**
     * test for validation of eanKataFalse.
     */
    @Test
    public void testEuropeArticleNumberKataFaile() {
        digits.setDigits("4003301018392");
        assertFalse(digits.validation());
    }

    /**
     * test for validation of eanSetEanTrue.
     */
    @Test
    public void testEuropeArticleNumberSetEanTrue() {
        digits.setDigits("1203301014353");
        assertEquals("1203301014353", digits.getDigits());
    }

    /**
     * test for validation of eanSetEanFalse.
     */
    @Test
    public void testEuropeArticleNumberSetEanFalse() {
        digits.setDigits("1203301014353");
        assertNotEquals("1203301014253", digits.getDigits());

    }
}
