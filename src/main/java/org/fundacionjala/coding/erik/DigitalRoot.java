package org.fundacionjala.coding.erik;

/**
 * This a class of digital Root.
 */
public class DigitalRoot {
    private static final int DIVISOR = 10;

    /**
     * @param number is a digital root.
     * @return a sum of number root.
     */
    public int digits(int number) {
        while (number > DIVISOR) {
            int sum = 0;
            while (number != 0) {
                sum += number % DIVISOR;
                number /= DIVISOR;
            }
            number = sum;
        }
        return number;
    }
}
