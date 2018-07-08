package org.fundacionjala.coding.franz.movies;

/**
 *  class abstrac Movie.
 */
public abstract class AMovie {

    private final String title;
    protected static final int POINT = 1;

    /**
     * Constructor.
     *
     * @param title movie.
     */
    public AMovie(String title) {
        this.title = title;
    }

    /**
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param days of rental days.
     * @return the total amount .
     */
    abstract double rentalAmount(int days);

    /**
     * @param days of rented.
     * @return frequent renter points.
     */
    abstract int frequentRenterPoints(int days);

}
