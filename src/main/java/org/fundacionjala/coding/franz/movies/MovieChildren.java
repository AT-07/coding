package org.fundacionjala.coding.franz.movies;

/**
 * calss of movie Children.
 */
public class MovieChildren extends AMovie {
    private static final double THREE = 3.0;
    private static final double ONE_PIRIOT_FIVE = 1.5;

    /**
     * Constructor.
     *
     * @param title of movie
     */
    public MovieChildren(String title) {
        super(title);
    }

    /**
     * .
     */
    @Override
    public double rentalAmount(int days) {

        return days > THREE ? (days - THREE) * ONE_PIRIOT_FIVE : ONE_PIRIOT_FIVE;
    }

    /**
     * .
     */
    @Override
    public int frequentRenterPoints(int days) {
        return POINT;
    }

}
