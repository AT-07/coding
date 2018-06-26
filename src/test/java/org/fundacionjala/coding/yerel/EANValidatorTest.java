package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * this a unit test for EANValidator.
 */
public class EANValidatorTest {

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
        assertTrue(eanValidator.validate("4003301018398"));
    }

    /**
     * this test verify false 4003301018392.
     */
    @Test
    public void validatorDos() {
        final String codigo = "400330101839";
        assertFalse(eanValidator.validate(codigo));
    }
}
