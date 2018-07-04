package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test of the class CamelCaseMethod.
 */
public class TestCamelCaseMethod {
    private CamelCaseMethod camelCaseM;

    /**
     * Constructor of the class.
     */
    @Before
    public void setUp() {
        camelCaseM = new CamelCaseMethod();
    }

    /**
     * Test of string of two words.
     */
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", camelCaseM.camelCase("test case"));
    }

    /**
     * Test of string of three words.
     */
    @Test
    public void testThreeWords() {

        assertEquals("CamelCaseMethod", camelCaseM.camelCase("camel case method"));
    }

    /**
     * Test of string of two words and empty space at the end.
     */
    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", camelCaseM.camelCase("say hello "));
    }

    /**
     * Test of string of one words.
     */
    @Test
    public void testSingleLetter() {
        assertEquals("Z", camelCaseM.camelCase("z"));
    }
}
