package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class CamelCaseTest {
    private CamelCase cs;

    /**
     * Run Before.
     */
    @Before
    public void before() {
        cs = new CamelCase();
    }

    /**
     *One Test with hello case.
     */
    @Test
    public void testCamelCaseFirst() {
        final String strintInput = "hello case";
        final String stirngOutput = "HelloCase";
        assertEquals(stirngOutput, cs.camelCase(strintInput));
    }

    /**
     *Second test with camel case word.
     */
    @Test
    public void testCamelCaseSecond() {
        final String strintInput = "camel case method";
        final String stirngOutput = "CamelCaseMethod";
        assertEquals(stirngOutput, cs.camelCase(strintInput));
    }

    /**
     * test with blank space.
     */
    @Test
    public void testLeadingSpace() {
        final String strintInput = " camel case word";
        final String stirngOutput = "CamelCaseWord";
        assertEquals(stirngOutput, cs.camelCase(strintInput));
    }

    /**
     *test one value.
     */
    @Test
    public void testSingleLetter() {
        final String strintInput = "z";
        final String stirngOutput = "Z";
        assertEquals(stirngOutput, cs.camelCase(strintInput));
    }

    /**
     * Test from two value and one value.
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        final String strintInput = "ab  c";
        final String stirngOutput = "AbC";
        assertEquals(stirngOutput, cs.camelCase(strintInput));
    }

}

