package org.fundacionjala.coding.franz.movies;

/**
 * class of Movie Regular.
 */
public class MovieRegular extends AMovie {
    private static final double ONE_POINT_FIVE = 1.5;

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
        return days > 2 ? (days - 2.0) * ONE_POINT_FIVE : 2;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return POINT;
    }

}
