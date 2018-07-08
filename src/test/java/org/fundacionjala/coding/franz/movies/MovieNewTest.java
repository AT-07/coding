package org.fundacionjala.coding.franz.movies;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * This class is to test Movie New methods.
 */
public class MovieNewTest {
    private MovieNew movieNew;

    /**
     * This method tests initiality.
     */
    @Before
    public void ini() {
        movieNew = new MovieNew("Movie test");
    }

    /**
     * test rental amount .
     */
    @Test
    public void testRentalAmount() {
        final int actual = 10;
        final double expected = 30.0;
        final double delta = 0.0;
        assertEquals(expected, movieNew.rentalAmount(actual), delta);
    }

    /**
     * testFrequentRenterPoints .
     */
    @Test
    public void testFrequentRenterPoints() {
        final int expected1 = 1;
        final int expected2 = 2;
        final int actual = 3;
        final int actual1 = 0;
        assertEquals(expected2, movieNew.frequentRenterPoints(actual));
        assertEquals(expected1, movieNew.frequentRenterPoints(actual1));
    }
}
