package org.fundacionjala.coding.denis;

/**
 * This is the main class of the European Article Number.
 */
public class Ean {
    private String digits;
    private static final int SIZECONTROL = 13;
    private static final int EANNUMBER = 10;
    private static final int MULTIPLICATOR = 3;
    private static final int MODULO = 2;


    /**
     * validation of the European article number.
     *
     * @return the validation of the European article number.
     */

    public boolean kata() {
        return getDigits().length() == SIZECONTROL && validation();
    }

    /**
     * executes the validation of the European article number.
     *
     * @return executes the validation of the European article number.
     */
    public boolean validation() {
        int sum = 0;
        int result;
        for (int i = 1; i < getDigits().length(); i++) {
            result = Character.getNumericValue(getDigits().charAt(i - 1));
            sum += i % MODULO == 0 ? result * MULTIPLICATOR : result;
        }
        int ckeckout = sum % EANNUMBER == 0 ? 0 : EANNUMBER - sum % EANNUMBER;
        return ckeckout == Character.getNumericValue(digits.charAt(digits.length() - 1));
    }

    /**
     * actual value of digits.
     *
     * @return actual value of digits.
     */
    public String getDigits() {
        return digits;
    }

    /**
     * update the value of the digits.
     *
     * @param digits is the value of EAN.
     */
    public void setDigits(String digits) {
        this.digits = digits;
    }

}
