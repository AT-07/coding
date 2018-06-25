package org.fundacionjala.coding.franz;

/**
 * this class is a exercise about number EAN.
 */
public class EanCode {
    private static final int MOD = 10;
    private static final int TRHEE = 3;

    /**
     * this method validate a number if is a EAN or not.
     *
     * @param number is a number for validate
     * @return true if is a number EAN
     */
    public boolean validationEAN(String number) {
        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            int numericValue = Character.getNumericValue(number.charAt(i));
            sum += (i + 1) % 2 == 0 ? numericValue * TRHEE : numericValue;
        }
        int endDigit = Character.getNumericValue(number.charAt(number.length() - 1));
        int checkSum = sum % MOD == 0 ? 0 : MOD - (sum % MOD);
        return endDigit == checkSum;
    }
}
