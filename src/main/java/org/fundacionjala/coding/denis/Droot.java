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
        return n < NUMCHECK ? n : check(n);
    }

    /**
     * @param data is the number of the work.
     * @return sum time execute.
     */
    public int check(int data) {
        final int dataDiv = 10;
        int sum = 0;
        while (data > NUMCHECK) {
            while (data != 0) {
                sum += data % dataDiv;
                data /= dataDiv;
            }
            data = sum;
            sum = 0;
        }
        return data;
    }
}
