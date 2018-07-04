package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test class.
 */
public class CamelCaseTest {

    private CamelCase word;

    /**
     * this run first.
     */
    @Before
    public void ini() {
        word = new CamelCase();
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseTwoWords() {
        assertEquals("TestCase", word.camelCase("test case"));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseThreeWords() {
        assertEquals("CamelCaseMethod", word.camelCase("camel case method"));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseLeadingSpace() {
        assertEquals("CamelCaseWord", word.camelCase(" camel case word"));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseTrailingSpace() {
        assertEquals("SayHello", word.camelCase("say hello "));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseSingleLetter() {
        assertEquals("Z", word.camelCase("z"));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseTwoSpacesBetweenWords() {
        assertEquals("AbC", word.camelCase("ab  c"));
    }

    /**
     * this is a test of method camelCase.
     */
    @Test
    public void testCamelCaseEmptyString() {
        assertEquals("", word.camelCase(""));
    }
}
