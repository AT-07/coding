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
     * Init of digits.
     */
    @Before
    public void before() {
        digits = new Ean();

    }

    /**
     * test for eanVerify of eanKataTrue.
     */
    @Test
    public void testEanKataEmptyPass() {
        final String empty = "";
        digits.setDigits(empty);
        assertFalse(digits.eanKata());
    }

    /**
     * test for eanVerify of eanKataTrue.
     */
    @Test
    public void testEanKataPass() {
        final String value = "4003301018398";
        digits.setDigits(value);
        assertTrue(digits.eanKata());
    }

    /**
     * test for eanVerify of eanKataFalse.
     */
    @Test
    public void testEanKataFail() {
        final String valueFail = "4003301018392";
        digits.setDigits(valueFail);
        assertFalse(digits.eanKata());
    }

    /**
     * test for eanVerify of eanSetEanTrue.
     */
    @Test
    public void testEanSetEanPass() {
        final String value = "4003301018398";
        digits.setDigits(value);
        assertEquals(value, digits.getDigits());
    }

    /**
     * test for eanVerify of eanSetEanFalse.
     */
    @Test
    public void testEanSetEanFail() {
        final String value = "4003301018398";
        final String valueFail = "4003301018392";
        digits.setDigits(valueFail);
        assertNotEquals(value, digits.getDigits());

    }
}
