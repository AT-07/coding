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
    public Rental(AMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * getDaysRented.
     *
     * @return daysRented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     *   .
     *
     * @return determineRentalAmount of days rented.
     */
    public double getRentalAmount() {
        return movie.rentalAmount(getDaysRented());
    }

    /**
     *   .
     *
     * @return renter points.
     */
    public int frequentRenterPoints() {
        return movie.frequentRenterPoints(getDaysRented());
    }

    /**
     * @return the rental figure depending on the Movie type.
     */
    public String getMovieTitle() {
        return movie.getTitle();
    }
}
