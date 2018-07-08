package org.fundacionjala.coding.franz.movies;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * This class is to test Customer methods.
 */
public class CustomerTest {
    private static final String SHAPES = "50 Sombras";
    private static final String AVENGERS = "Avengers 3 Infinity War";
    private static final String ANTMAN = "Antman and Wisp";
    private static final int MAX_CAPACITY = 80;
    private Customer customer;

    /**
     * This method tests initiality.
     */
    @Before
    public void ini() {
        customer = new Customer("Agapito pepito");
    }

    /**
     * testTotalAmount.
     */
    @Test
    public void testTotalAmount() {
        final int daysRented = 4;
        customer.addRental(new Rental(new MovieChildren(SHAPES), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new MovieNew(AVENGERS), daysRented1));
        final int daysRented2 = 1;
        customer.addRental(new Rental(new MovieRegular(ANTMAN), daysRented2));

        final double actualResult = customer.totalAmount();
        final double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * testFrequentPointsNewMovie.
     */
    @Test
    public void testFrequentPointsNewMovie() {
        final int daysRented = 5;
        customer.addRental(new Rental(new MovieChildren(SHAPES), daysRented));
        final int daysRented1 = 4;
        customer.addRental(new Rental(new MovieNew(AVENGERS), daysRented1));
        final int daysRented2 = 2;
        customer.addRental(new Rental(new MovieRegular(ANTMAN), daysRented2));

        final double actualResult = customer.totalFrequentPoints();
        final double expectedResult = 4;

        assertEquals(expectedResult, actualResult, 0);
    }


    /**
     * testStatement.
     */
    @Test
    public void testStatement() {
        final int days4 = 4;
        customer.addRental(new Rental(new MovieChildren(SHAPES), days4));
        final int days1 = 1;

        customer.addRental(new Rental(new MovieNew(AVENGERS), days1));
        customer.addRental(new Rental(new MovieRegular(ANTMAN), days1));

        final String actual = customer.statement();
        final StringBuilder expected = new StringBuilder(MAX_CAPACITY);
        expected.append("Rental for Agapito pepito\n50 Sombras 1.5"
                + "\nAvengers 3 Infinity War 3.0"
                + "\nAntman and Wisp 2.0"
                + "\nAmount is 6.5\nYou have 3 frequent points");
        assertEquals(expected.toString(), actual);
    }
}
