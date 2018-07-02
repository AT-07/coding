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
     * @return cont with is the result.
     */
    public int persistenceDigit(int number) {
        int counter = 0;
        if (number > CONSTANT_VERIFICATION) {
            counter = 1;
            while (number > 0) {
                number /= CONSTANT_MULTIPLICATION;
                counter++;
            }
        }
        return counter;
    }
}
