package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test case for camelCase class.
 */
public class ExcerciseCamelCaseTest {
    private ExcerciseCamelCase excerciseCamelCase;

    /**
     * inzialized a intance of class CamelCase.
     */
    @Before
    public void setUp() {
        excerciseCamelCase = new ExcerciseCamelCase();
    }

    /**
     * test case for junit "hello case".
     */
    @Test
    public void camelCase() {
        assertEquals("HelloCase", excerciseCamelCase.camelCase("hello case"));
    }

    /**
     * test case for a case "camel case word".
     */
    @Test
    public void camelCaseTwo() {
        assertEquals("CamelCaseWord", excerciseCamelCase.camelCase("camel case word"));
    }

}
