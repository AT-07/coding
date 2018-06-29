package org.fundacionjala.coding.franz;

/**
 * this is a class Persistance.
 */
public class Persistence {

    private static final int NUMBER_TEN = 10;
    private static final int NUMBER_NINE = 9;

    /**
     * @param n is a number for evalua its persistence
     * @return the cant of persistence of param
     */
    public int persistence(long n) {
        int result = 0;
        while (n > NUMBER_NINE) {
            long multiple = 1;
            while (n != 0) {
                multiple *= n % NUMBER_TEN;
                n /= NUMBER_TEN;
            }
            result++;
            n = multiple;
        }
        return result;
    }
}
