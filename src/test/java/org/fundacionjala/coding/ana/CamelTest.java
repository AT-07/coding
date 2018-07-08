package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class CamelTest {
    private Camel camel;

    /**
     * call tha class.
     */
    @Before
    public void setUp()  {
        camel = new Camel();
    }

    /**
     * test with TwoWords.
     */
    @Test
    public void testCamelCamelCaseTwoWords() {
        assertEquals("TestCase", camel.camelCase("test case"));
    }

    /**
     * test with ThreeWords.
     */
    @Test
    public void testCamelCamelCaseThreeWords() {
        assertEquals("CamelCaseMethod", camel.camelCase("camel case method"));
    }

    /**
     * test with LeadingSpace.
     */
    @Test
    public void testCamelCamelCaseLeadingSpace() {
        assertEquals("CamelCaseWord", camel.camelCase("camel case word"));
    }

    /**
     *  test with TrailingSpace.
     */
    @Test
    public void testCamelCamelCaseTrailingSpace() {
        assertEquals("SayHello", camel.camelCase("say hello "));
    }

    /**
     * test with SingleLetter.
     */
    @Test
    public void testCamelCamelCaseSingleLetter() {
        assertEquals("Z", camel.camelCase("z"));
    }
}

