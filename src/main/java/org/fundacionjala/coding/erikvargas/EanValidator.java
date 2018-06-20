package org.fundacionjala.coding.erikvargas;

/**
 * This method is responsible for validating in ean code.
 *
 * @author ErikVargas.
 * @return boolean.
 */
public class EanValidator {
    private static final int MULTIPLICADOR_PAR = 3;
    private static final int DIVISOR = 10;

    /**
     * this method validates ean code.
     * @param eanCode this is param set string.
     * @return true or false
     */
    public boolean validate(String eanCode) {

        int intEan;
        int sum = 0;
        for (int i = 0; i < eanCode.length(); i++) {
            intEan = Character.getNumericValue(eanCode.charAt(i));
            sum += i % 2 != 0 ? intEan * MULTIPLICADOR_PAR : intEan;
        }
        return sum % DIVISOR == 0;
    }
}
