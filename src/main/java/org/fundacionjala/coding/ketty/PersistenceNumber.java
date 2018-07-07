package org.fundacionjala.coding.ketty;

/**
 * the class verify if number is persistence.
 */

public class PersistenceNumber {
    private static final int NINE = 9;
    private static final int NUMBER_DIV_MOD = 10;

    /**
     * @param n is verify if number persistence.
     * @return cont or 0 because is cant digict.
     */
    public int persistence(int n) {
        int cont = 0;
        while (n > NINE) {
            int time = 1;
            cont++;
            while (n != 0) {
                time = n % NUMBER_DIV_MOD * time;
                n = n / NUMBER_DIV_MOD;
                cont++;
            }

        }
        return cont;
    }
}



