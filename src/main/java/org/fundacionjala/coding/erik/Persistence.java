package org.fundacionjala.coding.erik;

/**
 * This is class is for persistence Bugger.
 */
public class Persistence {
    private static final int DIVISOR = 10;

    /**
     * This is a method for number persistence.
     * @param num is the number persistent.
     * @return the number of multiplications.
     */
    public int numberPersistence(int num) {
        int cont = 0;
        while (num >= DIVISOR) {
            int multiplication = 1;
            while (num != 0) {
                multiplication *= num % DIVISOR;
                num /= DIVISOR;
            }
            cont++;
            num = multiplication;
        }
        return cont;
    }
}
