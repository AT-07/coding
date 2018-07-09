package org.fundacionjala.coding.denis;

public class Evaporation {
    private static final int MAXIMUNPERCENTAGE = 100;


    /*
     * @param content this de content maximum.
     * @param percentageLost is the content in percentage lost for day.
     * @param percentageThresholdis the percentage beyond which the evaporator is no longer useful.
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
