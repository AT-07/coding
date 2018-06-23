package org.fundacionjala.coding.franz;

/**
 * this is a class Persistance.
 */
public class Persistence {

    private static final int NUMBER_TEN = 10;

    /**
     * @param n is a number for evalua its persistence
     * @return the cant of persistence of param
     */
    public int persistence(long n) {
        int result = 0;
        while (n > 9) {
            long multiple = 1;
            while (n != 0) {
                multiple *= n % NUMBER_TEN;
                n = n / NUMBER_TEN;
            }
            result++;
            n = multiple;

        }
        return result;
    }
}
