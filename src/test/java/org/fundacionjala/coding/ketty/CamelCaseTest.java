package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * test of CamelCase.
 */

public class CamelCaseTest {
    private CamelCase camel;

    /**
     * instance .
     */
    @Before
    public void before() {
        camel = new CamelCase();
    }

    /**
     * test of pass Camel Case.
     */
    @Test
    public void camelCasePass() {
        final String phase = "hellow word";
        final String expected = "HellowWord";
        assertEquals(expected, camel.camelCase(phase));

    }

    /**
     * test of filed Camel Case.
     */
    @Test
    public void camelCaseFailed() {
        final String phase = "hellow word";
        final String expected = "Hellowword";
        assertNotEquals(expected, camel.camelCase(phase));

    }
}
