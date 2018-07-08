package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is the class test principal.
 */
public class TestCamelCase {
    private CamelCase words;

    /**
     * is when init the objet.
     */
    @Before
    public void before() {
        words = new CamelCase();
    }

    /**
     * test case TwoWords.
     */
    @Test
    public void testTwoWords() {
        final String data = "test case";
        final String spectedResult = "TestCase";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case ThreeWords.
     */
    @Test
    public void testThreeWords() {
        final String data = "camel case method";
        final String spectedResult = "CamelCaseMethod";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case LeadingSpace.
     */
    @Test
    public void testLeadingSpace() {
        final String data = " camel case word";
        final String spectedResult = "CamelCaseWord";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case TrailingSpace.
     */
    @Test
    public void testTrailingSpace() {
        final String data = "say hello ";
        final String spectedResult = "SayHello";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case SingleLetter.
     */
    @Test
    public void testSingleLetter() {
        final String data = "z ";
        final String spectedResult = "Z";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case TwoSpacesBetweenWords.
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        final String data = "ab  c";
        final String spectedResult = "AbC";
        assertEquals(spectedResult, words.camelCase(data));
    }

    /**
     * test case EmptyString.
     */
    @Test
    public void testEmptyString() {
        final String data = "";
        assertEquals(data, words.camelCase(data));
    }
}
