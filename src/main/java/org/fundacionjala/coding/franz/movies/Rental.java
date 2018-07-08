package org.fundacionjala.coding.franz.movies;

/**
 * class of rental.
 */
public class Rental {
    private AMovie movie;
    private int daysRented;

    /**
     * This is the constructor.
     *
     * @param movie      is an Movie .
     * @param daysRented is days rented.
     */
    public Rental(final AMovie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * .
     *
     * @return determineRentalAmount of days rented.
     */
    public double getRentalAmount() {
        return movie.rentalAmount(daysRented);
    }

    /**
     * .
     *
     * @return renter points.
     */
    public int frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }

    /**
     * @return the rental figure depending on the Movie type.
     */
    public String getMovieTitle() {
        return movie.getTitle();
    }
}
