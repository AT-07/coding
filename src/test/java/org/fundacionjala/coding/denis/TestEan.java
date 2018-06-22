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
    private String value;
    private String valueFail;

    /**
     * Init of digits.
     */
    @Before
    public void before() {
        digits = new Ean();
        value = "4003301018398";
        valueFail = "4003301018392";
    }


    /**
     * test for validation of eanKataTrue.
     */
    @Test
    public void testEuropeArticleNumberKataPass() {
        digits.setDigits(value);
        assertTrue(digits.kata());
    }

    /**
     * test for validation of eanKataFalse.
     */
    @Test
    public void testEuropeArticleNumberKataFaile() {
        digits.setDigits(valueFail);
        assertFalse(digits.kata());
    }

    /**
     * test for validation of eanSetEanTrue.
     */
    @Test
    public void testEuropeArticleNumberSetEanTrue() {
        digits.setDigits(value);
        assertEquals(value, digits.getDigits());
    }

    /**
     * test for validation of eanSetEanFalse.
     */
    @Test
    public void testEuropeArticleNumberSetEanFalse() {
        digits.setDigits(valueFail);
        assertNotEquals(value, digits.getDigits());

    }
}
