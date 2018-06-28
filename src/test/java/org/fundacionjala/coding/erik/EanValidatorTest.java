package org.fundacionjala.coding.erik;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * this class for  validate code ean.
 */
public class EanValidatorTest {

    private EanValidator test;

    /**
     * this is a builder.
     */
    public EanValidatorTest() {
        test = new EanValidator();
    }

    /**
     * this testcase validate a ean code is true.
     */
    @Test
    public void testValidateTrue1() {
        String codeEan = "4003301018398";
        boolean result = test.validate(codeEan);
        assertTrue(result);
    }

    /**
     * test for a second case when an ean code is true.
     */
    @Test
    public void testValidateTrue2() {
        String codeEan = "9783815820865";
        boolean result = test.validate(codeEan);
        assertTrue(result);
    }

    /**
     * this testcase validate a ean code is false.
     */
    @Test
    public void testValidateFalse1() {
        String codeEan = "4003301018392";
        boolean result = test.validate(codeEan);
        assertFalse(result);
    }

    /**
     * test for a second case when an ean code is false.
     */
    @Test
    public void testValidateFalse2() {
        String codeEan = "400330101839";
        boolean result = test.validate(codeEan);
        assertFalse(result);
    }

    /**
     * this is a test method for a number EAN true.
     */
    @Test
    public void testValidationEANisEANZero() {
        assertTrue(test.validate("0149600000000"));
    }

}
