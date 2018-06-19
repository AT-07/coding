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
        int eanNumber;
        for (int i = 0; i < number.length() - 1; i++) {
            eanNumber = i + 1;
            sum += eanNumber % 2 == 0 ? Character.getNumericValue(number.charAt(i)) * TRHEE
                    : Character.getNumericValue(number.charAt(i));
        }
        int endDigit = Character.getNumericValue(number.charAt(number.length() - 1));
        sum = sum % MOD == 0 ? 0 : MOD - (sum % MOD);
        return endDigit == sum;
    }
}

