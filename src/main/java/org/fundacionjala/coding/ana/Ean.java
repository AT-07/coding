package org.fundacionjala.coding.ana;

/**
 * goods have an International Article Number.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Ean {
    private static final int THREE = 3;
    private static final int DIVIDABLE = 10;

    /**
     * sum of check of  12 digit.
     *
     * @param number value of entry.
     * @return a value boolean.
     */
    public boolean articleNumber(final String number) {
        int sumValue = 0;
        int ultimateValue = Integer.parseInt(number.substring(number.length() - 1));
        for (int n = 0; n < number.length() - 1; n++) {
            int data = Character.getNumericValue(number.charAt(n));
            sumValue += n % 2 == 0 ? data : data * THREE;
        }
        sumValue = sumValue % DIVIDABLE == 0 ? 0 : DIVIDABLE - (sumValue % DIVIDABLE);
        return sumValue == ultimateValue;
    }

}
