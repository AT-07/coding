package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
        assertFalse(digits.eanKata(empty));
    }

    /**
     * test for eanVerify of eanKataTrue.
     */
    @Test
    public void testEanKataPass() {
        final String value = "4003301018398";
        assertTrue(digits.eanKata(value));
    }

    /**
     * test for eanVerify of EanKataZero.
     */
    @Test
    public void testEanKataZeroPass() {
        final String value = "9783827317100";
        assertTrue(digits.eanKata(value));
    }

    /**
     * test for eanVerify of eanKataFalse.
     */
    @Test
    public void testEanKataFail() {
        final String valueFail = "4003301018392";
        final String valueFail1 = "40033010";
        assertFalse(digits.eanKata(valueFail));
        assertFalse(digits.eanKata(valueFail1));
    }
}
