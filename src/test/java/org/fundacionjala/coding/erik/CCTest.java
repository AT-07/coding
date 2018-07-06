package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class test.
 */
public class CCTest {
    public static final int VALUE = 4;
    private CC test;
    /**
    * before ini.
    */
    @Before
    public void before() {
        test = new CC();
    }
    /**
     * this is a first test.
     */
    @Test
    public void testSomething() {
        assertEquals(VALUE, test.charCount("fizzbuzz", 'z'));
        assertEquals(VALUE, test.charCount("FIZZBUZZ", 'z'));
    }
}
