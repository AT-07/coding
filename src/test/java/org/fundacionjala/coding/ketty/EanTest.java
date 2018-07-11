package org.fundacionjala.coding.ketty;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * test of Ean class.
 */

public class EanTest {

    private Ean ean = new Ean();

    /**
     * test validate 400330101839 is true.
     */
    @Test
    public void eanOperationPass() {
        String num = "4003301018398";

        assertTrue(ean.eanOperation(num));

    }

    /**
     * test validate   string  "4003301018392" its last digit 2 is False.
     */
    @Test
    public void eanOperationFailed() {

        String num = "4003301018392";
        assertFalse(ean.eanOperation(num));
    }


}
