package org.fundacionjala.coding.franz.movies;

/**
 * class MovieNew.
 */
public class MovieNew extends AMovie {
    private static final double DISCOUNT_PRICE = 3.0;
    private static final int DAY_ONE = 1;
    private static final int DAY_TWO = 2;

    /**
     * Constructor .
     *
     * @param title movi
     */
    public MovieNew(final String title) {
        super(title);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double rentalAmount(final int days) {
        return days * DISCOUNT_PRICE;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int frequentRenterPoints(final int days) {
        return days > DAY_ONE ? DAY_TWO : DAY_ONE;
    }

}
