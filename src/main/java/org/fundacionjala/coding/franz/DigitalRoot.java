package org.fundacionjala.coding.franz;

/**
 * this class is about digital Root.
 */
public class DigitalRoot {
    private static final int TEN = 10;
    private static final int NINE = 9;

    /**
     * @param n is a number form digital root
     * @return a sum of number root
     */
    public int digitaRoot(int n) {
        int sum;
        while (n > NINE) {
            sum = 0;
            while (n != 0) {
                sum += n % TEN;
                n /= TEN;
            }
            n = sum;
        }
        return n;
    }
}
