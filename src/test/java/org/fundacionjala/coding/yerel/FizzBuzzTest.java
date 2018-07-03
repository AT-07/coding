package org.fundacionjala.coding.yerel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * test unit for class FizzBuzz.
 */
public class FizzBuzzTest {
    /**
     * test to validate if list return FizzFuzz.
     */
    @Test
    public void multiplesForNumberFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<Integer> list = new ArrayList<>();
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int eigth = 8;
        final int nine = 9;
        final int teen = 10;
        final int eleven = 11;
        final int twelve = 12;
        final int thirteen = 13;
        final int fourteen = 14;
        final int fifteen = 15;
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eigth);
        list.add(nine);
        list.add(teen);
        list.add(eleven);
        list.add(twelve);
        list.add(thirteen);
        list.add(fourteen);
        list.add(fifteen);

        List<String> listExpeted = new ArrayList<>();
        listExpeted.add("1");
        listExpeted.add("2");
        listExpeted.add("Fizz");
        listExpeted.add("4");
        listExpeted.add("Buzz");
        listExpeted.add("Fizz");
        listExpeted.add("7");
        listExpeted.add("8");
        listExpeted.add("Fizz");
        listExpeted.add("Buzz");
        listExpeted.add("11");
        listExpeted.add("Fizz");
        listExpeted.add("Fizz");
        listExpeted.add("14");
        listExpeted.add("FizzBuzz");

        assertEquals(listExpeted, fizzBuzz.multiplesForNumberOther(list));
    }
}
