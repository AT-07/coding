package org.fundacionjala.coding.william;

/**
 * Evaporator class that is responsible for calculating the days that an evaporator could be used.
 */
public class Evaporator {

    private static final int PERCENTAGEMAXIMUN = 100;

    /**
     * The program reports the nth day (as an integer) on which the evaporator will be out of use.
     *
     * @param countMl             content of the evaporator.
     * @param percentageLost      the percentage of foam or gas lost every day.
     * @param percentageThreshold percentage beyond which the evaporator is no longer useful.
     * @return counter what is the number of days.
     */
    public int evaporator(double countMl, double percentageLost, double percentageThreshold) {
        int counter = 0;
        double resultThreshold = (countMl * percentageThreshold) / PERCENTAGEMAXIMUN;
        double resultLost = percentageLost / PERCENTAGEMAXIMUN;
        while (countMl > resultThreshold) {
            countMl -= countMl * resultLost;
            counter++;
        }
        return counter;
    }
}
