package org.fundacionjala.coding.ketty;

/**
 * the class verify if number is persistence.
 */

public class PersistenceNumber {
    static final int NUMBER_DIV_MOD = 10;
    static final int LIMIT_NUMBER = 9;

    /**
     * @param n is verify if number persistence.
     * @return cont or 0 because is cant digict.
     */
    public int persistence(int n) {
        int time = 1;
        int cont = 1;
        if (contDigict(n) != 1) {
            while (n > 0) {
                time = n % NUMBER_DIV_MOD * time;
                n = n / NUMBER_DIV_MOD;
                if (n == 0 && time > LIMIT_NUMBER) {
                    n = time;
                    time = 1;
                    cont++;
                }

            }
            return cont;
        }
        return 0;

    }

    /**
     * @param n number for cont number its digict.
     * @return contDigit the cant of digict.
     */
    public int contDigict(int n) {
        int contDigict = 0;
        while (n != 0) {
            n = n / NUMBER_DIV_MOD;
            contDigict++;
        }
        return contDigict;

    }
}
