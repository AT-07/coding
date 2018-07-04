package org.fundacionjala.coding.erik;

/**
 * this class is Evaporator.
 */

public class Evaporator {
    private static final int NUMBER = 100;

    /**
     * this method is evaporator.
     *
     * @param evalPerDay gas lost per day.
     * @param threshold is umbra.
     * @return the day.
     */
    public int evaporator(double evalPerDay, double threshold) {
        double content = NUMBER;
        int cont = 0;
        while (content > threshold) {
            content = content * (NUMBER - evalPerDay) / NUMBER;
            cont++;
        }
        return cont;
    }
}
