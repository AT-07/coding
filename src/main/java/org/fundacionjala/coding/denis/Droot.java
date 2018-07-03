package org.fundacionjala.coding.denis;

/**
 * this is the main class.
 */
public class Droot {
    private static final int NUMCHECK = 9;

    /**
     * @param n is the number of the work.
     * @return sum time execute.
     */
    public int digitalRoot(int n) {
        if (n > NUMCHECK) {
            final int dataDiv = 10;
            while (n > NUMCHECK) {
                int sum = 0;
                while (n != 0) {
                    sum += n % dataDiv;
                    n /= dataDiv;
                }
                n = sum;
            }
        }
        return n;
    }
}
