package org.fundacionjala.coding.denis;

/**
 * This is the main class of the European Article Number.
 */
public class Ean {

    private static final int SIZECONTROL = 13;
    private static final int EANNUMBER = 10;
    private static final int MULTIPLICATOR = 3;
    private static final int MODULO = 2;

    /**
     * @param digits eanVerify of the European article number.
     * @return the eanVerify of the European article number.
     */

    public boolean eanKata(final String digits) {
        if (digits.length() == SIZECONTROL) {
            int suma = 0;
            int result;
            for (int i = 1; i < digits.length(); i++) {
                result = Character.getNumericValue(digits.charAt(i - 1));
                suma += i % MODULO == 0 ? result * MULTIPLICATOR : result;
            }
            int checking = suma % EANNUMBER == 0 ? 0 : EANNUMBER - suma % EANNUMBER;
            return checking == Character.
                    getNumericValue(digits.charAt(digits.length() - 1));
        } else {
            return false;
        }
    }
}
