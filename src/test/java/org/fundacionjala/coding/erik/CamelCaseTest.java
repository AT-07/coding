package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test class camel case.
 */
public class CamelCaseTest {
    private CamelCase test;

    /**
     * this is class ini.
     */
    @Before
    public void ini() {
        test = new CamelCase();
    }

    /**
     * this is first unit test.
     */
    @Test
    public void camelCase() {
        assertEquals("HelloCase", test.camelCase("hello case"));
    }

    /**
     * this is second unit test.
     */
    @Test
    public void camelCaseTwo() {
        assertEquals("CamelCaseWord", test.camelCase("camel case word"));
    }
}
