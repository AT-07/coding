package org.fundacionjala.coding.franz;

/**
 * this class is about digital Root.
 */
public class DigitalRoot {
    private static final int TEN = 10;

    /**
     * @param n is a number form digital root
     * @return a sum of number root
     */
    public int digitaRoot(int n) {
        int sum;
        while (String.valueOf(n).length() > 1) {
            sum = 0;
            while (n != 0) {
                sum += n % TEN;
                n = n / TEN;
            }
            n = sum;
        }
        return n;
    }
}
