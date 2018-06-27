package org.fundacionjala.coding.maria;

/**
 * goods have an International Article Number.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Ean {
    private static final int ONE = 1;
    private static final int THREE = 3;
    private static final int DIVIDABLE = 10;

    /**
     * suma de comprobacion de 12 digitos.
     *
     * @param number numero esperodo.
     * @return devuelve un valor boolean.
     */
    public boolean articleNumber(String number) {
        int sumValue = 0;
        int ultimateValue = Integer.parseInt(number.substring(number.length() - 1));
        for (int n = 0; n < number.length() - 1; n++) {
           if (n % 2 == 0) {
                sumValue += Character.getNumericValue(number.charAt(n)) * ONE;
            } else {
                sumValue += Character.getNumericValue(number.charAt(n)) * THREE;
            }
        }
        sumValue = sumValue % DIVIDABLE == 0 ? 0 : DIVIDABLE - (sumValue % DIVIDABLE);
        return sumValue == ultimateValue;
    }

}

