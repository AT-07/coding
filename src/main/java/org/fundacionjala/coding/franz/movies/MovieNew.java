package org.fundacionjala.coding.franz.movies;

/**
 * class MovieNew.
 */
public class MovieNew extends AMovie {
    private static final double PRICE_FOR_DAY = 3.0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    /**
     * Constructor .
     *
     * @param title movi
     */
    public MovieNew(final String title) {
        super(title);
    }

    /**
     * .
     */
    @Override
    public double rentalAmount(final int days) {
        return days * PRICE_FOR_DAY;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return days > ONE ? TWO : ONE;
    }

}
