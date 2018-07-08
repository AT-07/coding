package org.fundacionjala.coding.franz.movies;

/**
 * class of Movie Regular.
 */
public class MovieRegular extends AMovie {
    private static final double DISCOUNT_PRICE = 1.5;
    private static final int TWO = 2;

    /**
     * Constructor.
     *
     * @param title of the Movie.
     */
    public MovieRegular(final String title) {
        super(title);
    }

    /**
     * .
     */
    @Override
    public double rentalAmount(final int days) {
        return days > TWO ? (days - 2.0) * DISCOUNT_PRICE : TWO;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return POINT;
    }

}
