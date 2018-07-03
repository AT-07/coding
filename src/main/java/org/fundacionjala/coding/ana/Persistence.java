package org.fundacionjala.coding.ana;

/**
 * number persistence.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Persistence {
    private static final int CONSTANT = 9;
    /**
     * number of times it multiplies itself.
     *
     * @param number value into.
     * @return a String.
     */
    public int cantPersistence(int number) {
        int result = 0;
        while (number > CONSTANT) {
            int multiplicate = 1;
            for (char data : String.valueOf(number).toCharArray()) {
                multiplicate *= Integer.parseInt(String.valueOf(data));
            }
            number = multiplicate;
            result++;
        }
        return result;
    }

}
