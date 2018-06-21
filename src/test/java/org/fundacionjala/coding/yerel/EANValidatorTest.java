package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * this a unit test for EANValidator.
 */
public class EANValidatorTest {

    public static final int EXPRESULT = 72;
    private static final String CODIGO = "400330101839";
    private EANValidator eanValidator;

    /**
     * this is begin a instants method.
     */
    @Before
    public void setUp() {
        eanValidator = new EANValidator();
    }

    /**
     * this test verify 4003301018398 is a true.
     */
    @Test
    public void validator() {
        assertTrue(eanValidator.validator("4003301018398"));
    }


    /**
     * this test verify 400330101839 add is true.
     */
    @Test
    public void sumNumbersCode() {
        assertEquals(EXPRESULT, eanValidator.sumNumbersCode(CODIGO));
    }

    /**
     * this test 400330101839 is equals to 72.
     */
    @Test
    public void sumNumbersCodeDos() {
        assertEquals(EXPRESULT, eanValidator.sumNumbersCode(CODIGO));
    }

    /**
     * this test verify false 4003301018392.
     */
    @Test
    public void validatorDos() {
        assertFalse(eanValidator.validator(CODIGO));
    }
}
