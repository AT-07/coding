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
    public MovieRegular(String title) {
        super(title);
    }

    /**
     * .
     */
    @Override
    public double rentalAmount(int days) {
        return days > 2 ? (days - 2.0) * ONE_POINT_FIVE : 2;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(int days) {
        return POINT;
    }

}
