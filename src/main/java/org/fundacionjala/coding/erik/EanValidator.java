package org.fundacionjala.coding.erik;

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
     *
     * @param eanCode this is param set string.
     * @return true or false
     */
    boolean validate(final String eanCode) {
        int sum = 0;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            int intEan = Character.getNumericValue(eanCode.charAt(i));
            sum += i % 2 != 0 ? intEan * MULTIPLICADOR_PAR : intEan;
        }
        int comp = sum % DIVISOR == 0 ? 0 : DIVISOR - (sum % DIVISOR);
        int last = Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
        return comp == last;
    }
}
