package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * this class is a test.
 */
public class CountCharactersTest {


    private CountCharacters count;

    /**
     * this method ini firt.
     */
    @Before
    public void ini() {
        count = new CountCharacters();
    }

    /**
     * this is a test of method charCount.
     */
    @Test
    public void testcharCount() {
        final int number = 4;
        assertEquals(number, count.charCount("fizzbuzz", 'z'));
        assertEquals(number, count.charCount("FIZZBUZZ", 'z'));
    }
}
