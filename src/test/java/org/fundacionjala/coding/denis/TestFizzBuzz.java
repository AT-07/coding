package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * This is the class test principal.
 */
public class TestFizzBuzz {

    private FizzBuzz data;

    /**
     * this method init the object data.
     */
    @Before
    public void before() {
        data = new FizzBuzz();
    }

    /**
     * this is the method when verify the method fizzBuzzCheck.
     */
    @Test
    public void testFizzBuzzCheckPass() {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        final List<Integer> numbers1 = Arrays.asList(13, 14, 15, 16, 350, 35, 51, 52, 310);
        final String espectedResult = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz";
        final String espectedResult1 = "Fizz,14,FizzBuzz,16,Buzz,Buzz,Buzz,Buzz,Buzz";
        assertEquals(espectedResult, data.fizzBuzzCheck(numbers));
        assertEquals(espectedResult1, data.fizzBuzzCheck(numbers1));
    }
}
