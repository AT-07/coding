package org.fundacionjala.coding.franz.movies;

/**
 * class of Movie Regular.
 */
public class MovieRegular extends AMovie {
    private static final double DISCOUNT_PRICE = 1.5;
    private static final int DAT_TWO = 2;

    /**
     * Constructor.
     *
     * @param title of the Movie.
     */
    public MovieRegular(final String title) {
        super(title);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double rentalAmount(final int days) {
        return days > DAT_TWO ? (days - 2.0) * DISCOUNT_PRICE : DAT_TWO;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return POINT;
    }

}
