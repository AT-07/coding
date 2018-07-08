package org.fundacionjala.coding.franz.movies;

/**
 * class MovieNew.
 */
public class MovieNew extends AMovie {
    private static final double THREE_POINT_ZERO = 3.0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    /**
     * Constructor .
     *
     * @param title movi
     */
    public MovieNew(String title) {
        super(title);
    }

    /**
     * .
     */
    @Override
    public double rentalAmount(int days) {
        return days * THREE_POINT_ZERO;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(int days) {
        return days > ONE ? TWO : ONE;
    }

}
