package org.fundacionjala.coding.yerel;

/**
 * This program tests the life of an evaporator containing a gas.
 */
public class Evaporator {
    private static final double NUMBER_ONE = 1;
    private static final double NUMBER_ONEHUNDER = 100.0;

    /**
     * @param content      the content of the evaporator.
     * @param evapPerDay the percentage of foam or gas lost every day.
     * @param threshold    percentage beyond which the evaporator is no longer useful.
     * @return reports the nth day (as an integer) on which the evaporator will be out of use.
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        int daysOutUse = 0;
        double copyContent = content * threshold / NUMBER_ONEHUNDER;
        while (content >= copyContent) {
            content = content * (NUMBER_ONE - evapPerDay / NUMBER_ONEHUNDER);
            daysOutUse += NUMBER_ONE;
        }
        return daysOutUse;
    }
}
