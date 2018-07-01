package org.fundacionjala.coding.ana;

/**
 * number digital root of sum.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Digital {
    private static final int CONSTANT = 10;

    /**
     * method for the sum of one digit only result.
     *
     * @param number that receive.
     * @return give back a int.
     */
    public int digitalRoot(int number) {
        while (number >= CONSTANT) {
            int sum = 0;
            for (char valueSum : String.valueOf(number).toCharArray()) {
                sum += Integer.parseInt(String.valueOf(valueSum));
            }
            number = sum;
        }
        return number;
    }

}

