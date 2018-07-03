package org.fundacionjala.coding.franz;

/**
 * this is class of Evaporator.
 */
public class Evaporator {
    private static final int HUNDRED = 100;

    /**
     * this method.
     *
     * @param content   cant
     * @param evapDay   cant of evaporate
     * @param threshold limit porcent
     * @return days that evaporate
     */
    public int evaporator(double content, double evapDay, double threshold) {
        double limit = content * (threshold / HUNDRED);
        int days = 0;
        double reduce;
        while (content > limit) {
            reduce = content * (evapDay / HUNDRED);
            content -= reduce;
            days++;
        }
        return days;
    }
}
