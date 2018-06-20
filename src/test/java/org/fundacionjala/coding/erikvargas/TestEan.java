package org.fundacionjala.coding.erikvargas;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * this a class.
 */
public class TestEan {

    private EanValidator test;

    /**
     * this is a constructor.
     */
    public TestEan() {
        test = new EanValidator();
    }

    /**
     * este test valida un codigo ean verdadero.
     */
    @Test
    public void testValidateTrue1() {
        String codeEan = "4003301018398";
        boolean result = test.validate(codeEan);
        assertTrue(result);
    }

    /**
     * test para un segundo caso para validar un codigo ean verdadero.
     */
    @Test
    public void testValidateTrue2() {
        String codeEan = "9783815820865";
        boolean result = test.validate(codeEan);
        assertTrue(result);
    }

    /**
     * test para codigo ean falso.
     */
    @Test
    public void testValidateFalse1() {
        String codeEan = "4003301018392";
        boolean result = test.validate(codeEan);
        assertFalse(result);
    }

    /**
     * test para codigo ean falso.
     */
    @Test
    public void testValidateFalse2() {
        String codeEan = "400330101839";
        boolean result = test.validate(codeEan);
        assertFalse(result);
    }

}
