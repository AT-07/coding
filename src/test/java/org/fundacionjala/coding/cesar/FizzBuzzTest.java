package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 *
 * @author admin-hp
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    /**
     * Inilialize from before.
     */
    @Before
    public void before() {
        fb = new FizzBuzz();
    }

    /**
     * Test with list whole and returns list of replaced chains.
     */
    @Test
    public void testFizzBuzz() {
        final int one = 1;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int fifteen = 15;

        final List<Integer> range = new ArrayList<>();
        range.add(one);
        range.add(three);
        range.add(four);
        range.add(five);
        range.add(fifteen);
        final List<String> rangeres = new ArrayList<>();
        rangeres.add("1");
        rangeres.add("fizz");
        rangeres.add("4");
        rangeres.add("buzz");
        rangeres.add("fizzbuzz");
        assertThat(rangeres, is(fb.doBuzzFizz(range)));

    }
}
