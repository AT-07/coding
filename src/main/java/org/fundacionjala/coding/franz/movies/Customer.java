package org.fundacionjala.coding.franz.movies;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> listRental = new ArrayList<>();
    private static final int MAX_CAPACITY = 80;

    /**
     * This is the constructor of Customer Class.
     *
     * @param name person who rent a movie.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * .
     *
     * @param rental is a rental.
     */
    public void addRental(Rental rental) {
        listRental.add(rental);
    }

    /**
     * Summary rentals of a customer.
     *
     * @return summary of rentals.
     */
    public String statement() {
        StringBuilder result1 = new StringBuilder(MAX_CAPACITY);
        result1.append("Rental for ").append(name).append("\n");
        for (Rental rental : listRental) {
            result1.append(rental.getMovieTitle())
                    .append(" ")
                    .append(rental.getRentalAmount())
                    .append("\n");
        }
        result1.append("Amount is ").append(totalAmount()).append("\n")
                .append("You have ").append(totalFrequentPoints())
                .append(" frequent points");
        return result1.toString();
    }



    /**
     * this method .
     *
     * @return total amount
     */
    public double totalAmount() {
        return listRental.stream().mapToDouble(Rental::getRentalAmount).sum();
    }

    /**
     * this method.
     *
     * @return total frequent.
     */
    public int totalFrequentPoints() {
        return listRental.stream().mapToInt(Rental::frequentRenterPoints).sum();
    }

}

