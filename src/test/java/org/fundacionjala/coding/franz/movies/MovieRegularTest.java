package org.fundacionjala.coding.franz.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is to test Movie Regular methods.
 */
public class MovieRegularTest {

    private MovieRegular movieRegular;

    /**
     * This method tests initiality.
     */
    @Before
    public void ini() {
        movieRegular = new MovieRegular("Movie test");
    }

    /**
     * test rental amount.
     */
    @Test
    public void testRentalAmount() {
        final int actual = 8;
        final double expected = 9.0;
        final double delta = 0.0;
        assertEquals(expected, movieRegular.rentalAmount(actual), delta);
    }

    /**
     * testFrequentRenterPoints.
     */
    @Test
    public void testFrequentRenterPoints() {
        final int expected = 1;
        final int actual = 10;
        final int actual1 = 2;
        assertEquals(expected, movieRegular.frequentRenterPoints(actual));
        assertEquals(expected, movieRegular.frequentRenterPoints(actual1));
    }
}
