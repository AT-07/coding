package org.fundacionjala.coding.franz.movies;

class Rental {
    private AMovie movie;
    private int daysRented;

    /**
     * This is the constructor of Rental.
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
     * DetermineRentalAmount.
     *
     * @return determineRentalAmount of days rented.
     */
    public double getRentalAmount() {
        return movie.rentalAmount(getDaysRented());
    }

    /**
     * the frequent renter points of the Movie.
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