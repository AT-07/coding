package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * this is the class test main.
 */
public class TestCountCharacter {
    private CountCharacter counter;

    /**
     * this is the init the objet.
     */
    @Before
    public void before() {
        counter = new CountCharacter();
    }

    /**
     * this i9s the method CharCount.
     */
    @Test
    public void testCountCharacterCharCountPass() {
        final String data = "fizzbuzz";
        final String data1 = "FIZZBUZZ";
        final char comparador = 'z';
        final char comparador1 = 'z';
        final int espectedResult = 4;
        assertEquals(espectedResult, counter.charCount(data, comparador));
        assertEquals(espectedResult, counter.charCount(data1, comparador1));
    }

}
