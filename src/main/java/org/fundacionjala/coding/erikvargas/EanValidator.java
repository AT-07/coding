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
     *
     * @param eanCode this is param set string.
     * @return true or false
     */
    public boolean validate(String eanCode) {

        int intEan;
        int sum = 0;
        int last = Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
        for (int i = 0; i < eanCode.length() - 1; i++) {
            intEan = Character.getNumericValue(eanCode.charAt(i));
            sum += i % 2 != 0 ? intEan * MULTIPLICADOR_PAR : intEan;
        }
        int comp = sum % DIVISOR == 0 ? 0 : DIVISOR - (sum % DIVISOR);
        return comp == last;
    }
}
