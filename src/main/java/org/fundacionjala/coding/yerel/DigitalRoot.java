package org.fundacionjala.coding.yerel;

/**
 * this class return root of number.
 */
public class DigitalRoot {
    private static final int NUMBER_TEEN = 10;
    private static final int NUMBER_ZERO = 0;

    /**
     * @param number is a number a root.
     * @return root this number.
     */
    public int addDigit(int number) {
        int addNumber = NUMBER_ZERO;
        while (number >= NUMBER_TEEN) {
            while (number != NUMBER_ZERO) {
                addNumber += number % NUMBER_TEEN;
                number /= NUMBER_TEEN;
            }
            number = addNumber;
            addNumber = NUMBER_ZERO;
        }
        return number;
    }
}
