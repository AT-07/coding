package org.fundacionjala.coding.franz.movies;

/**
 * calss of movie Children.
 */
public class MovieChildren extends AMovie {
    private static final double NUMBER_THREE = 3.0;
    private static final double DISCOUNT_PRICE = 1.5;

    /**
     * Constructor.
     *
     * @param title of movie
     */
    public MovieChildren(final String title) {
        super(title);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double rentalAmount(final int days) {

        return days > NUMBER_THREE ? (days - NUMBER_THREE) * DISCOUNT_PRICE : DISCOUNT_PRICE;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return POINT;
    }

}
