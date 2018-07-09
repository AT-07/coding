package org.fundacionjala.coding.yerel;

/**
 * PersistenteInseparable class count multiplication of a number.
 */
public class PersistenteInseparable {
    private static final int NUMBER_TEEN = 10;
    private static final int NUMBER_ZERO = 0;

    /**
     * @param number is a number persistence.
     * @return cuantity of persistence.
     */
    public int persistence(int number) {
        int countTime = 0;
        while (number > NUMBER_TEEN) {
            int multNumber = 1;
            while (number != NUMBER_ZERO) {
                multNumber *= number % NUMBER_TEEN;
                number /= NUMBER_TEEN;
            }
            number = multNumber;
            countTime++;
        }
        return countTime;
    }
}
