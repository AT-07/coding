package org.fundacionjala.coding.franz;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * this class is a objetc kata1.
 */
public class EanCodeTest {
    private EanCode kata;

    /**
     * this is a constructor of class.
     */
    public EanCodeTest() {
        kata = new EanCode();
    }

    /**
     * this is a test method for a number EAN true.
     */
    @Test
    public void testValidationEANisEAN() {
        assertTrue(kata.validationEAN("4003301018398"));

    }

    /**
     * this is a test method for a number EAN true.
     */
    @Test
    public void testValidEANValidationEANisEANValidNumber() {
        assertTrue(kata.validationEAN("0149600000000"));
    }

    /**
     * this is a test method for a number EAN false.
     */
    @Test
    public void testValidationEANisntEAN() {
        assertFalse(kata.validationEAN("4003301018392"));
    }
}
