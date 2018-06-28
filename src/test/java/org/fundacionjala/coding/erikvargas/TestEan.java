package org.fundacionjala.coding.erikvargas;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * this class for  validate code ean.
 */
public class TestEan {

    private EanValidator test;

    /**
     * this is a builder.
     */
    public TestEan() {
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

}
