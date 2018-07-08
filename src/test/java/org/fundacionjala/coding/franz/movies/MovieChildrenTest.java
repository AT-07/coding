package org.fundacionjala.coding.franz.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieChildrenTest {


    private MovieChildren movieChildren;

    @Before
    public void ini() {
        movieChildren = new MovieChildren("capitan");
    }

    /**
     * .
     */
    @Test
    public void testRentalAmount() {
        final double expected = 10.5;
        final double expected1 = 1.5;
        final int actual = 10;
        final int actual1 = 2;
        final double delta = 0.0;
        assertEquals(expected, movieChildren.rentalAmount(actual), delta);
        assertEquals(expected1, movieChildren.rentalAmount(actual1), delta);
    }

    /**
     * .
     */
    @Test
    public void testFrequentRenterPoints() {
        final int expected = 1;
        final int actual = 10;
        final int actual1 = 2;
        assertEquals(expected, movieChildren.frequentRenterPoints(actual));
        assertEquals(expected, movieChildren.frequentRenterPoints(actual1));
    }

}