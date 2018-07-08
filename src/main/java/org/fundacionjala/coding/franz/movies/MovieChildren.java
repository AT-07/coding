package org.fundacionjala.coding.franz.movies;

/**
 * calss of movie Children.
 */
public class MovieChildren extends AMovie {
    private static final double THREE = 3.0;
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
     * .
     */
    @Override
    public double rentalAmount(final int days) {

        return days > THREE ? (days - THREE) * DISCOUNT_PRICE : DISCOUNT_PRICE;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return POINT;
    }

}
