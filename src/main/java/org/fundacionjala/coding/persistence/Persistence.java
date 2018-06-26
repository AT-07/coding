package org.fundacionjala.coding.persistence;

/**
 * Class that is responsible for making multiplicative persistent calculations given an entry number.
 */
public class Persistence {
    public static final int CONSTANT_MULTIPLICATION = 10;
    public static final int CONSTANT_VERIFICATION = 9;

    /**
     * Method that performs the conversions of the persistent number.
     *
     * @param number is the persistence digital.
     * @return cont with is the result..
     */
    public int persistenceDigit(int number) {
        int cont = 0;
        int result = 0;
        while (number > CONSTANT_VERIFICATION) {
            cont = 1;
            while (number > 0) {
                result *= number % CONSTANT_MULTIPLICATION;
                number = number / CONSTANT_MULTIPLICATION;
                cont++;
            }
        }
        return cont;
    }
}
