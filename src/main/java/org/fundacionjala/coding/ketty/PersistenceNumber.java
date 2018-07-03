package org.fundacionjala.coding.ketty;

/**
 * the class verify if number is persistence.
 */

public class PersistenceNumber {

    /**
     * @param n is verify if number persistence.
     * @return cont or 0 because is cant digict.
     */
    public int persistence(int n) {
        final int numberDivMod = 10;
        final int limitNumber = 9;
        int time = 1;
        int cont = 1;
        int cantDig = (int) (Math.log10(n) + 1);
        if (cantDig != 1) {
            while (n > 0) {
                time = n % numberDivMod * time;
                n = n / numberDivMod;
                if (n == 0 && time > limitNumber) {
                    n = time;
                    time = 1;
                    cont++;
                }

            }
            return cont;
        }
        return 0;

    }

}
