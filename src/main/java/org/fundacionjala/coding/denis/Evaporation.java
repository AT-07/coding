package org.fundacionjala.coding.denis;

/**
 * Thi is the class principal.
 */
public class Evaporation {
    private static final int MAXIMUNPERCENTAGE = 100;

    /**
     * @param content             this de content maximum.
     * @param percentageLost      is the content in percentage lost for day.
     * @param percentageThreshold is the percentage beyond which the evaporator is no longer useful.
     * @return the days of use.
     */
    public int evaporation(double content, double percentageLost, double percentageThreshold) {
        int days = 0;
        double resultThreshold = (content * percentageThreshold) / MAXIMUNPERCENTAGE;
        double resultLost = percentageLost / MAXIMUNPERCENTAGE;
        while (content > resultThreshold) {
            content -= content * resultLost;
            days++;
        }
        return days;
    }
}
