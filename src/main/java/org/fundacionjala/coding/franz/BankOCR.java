package org.fundacionjala.coding.franz;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * this class is a BankOCR.
 */
public class BankOCR {
    private static final int ZERO = 0;
    private static final int THREE = 3;
    private static final int ELEVEN = 11;
    private int numberMulti;
    private static final int TEN = 10;

    private static final Map<String, String> DIGITAL_NUMBERS = new HashMap<>();

    static {
        DIGITAL_NUMBERS.put("     |  |", "1");
        DIGITAL_NUMBERS.put(" _  _||_ ", "2");
        DIGITAL_NUMBERS.put(" _  _| _|", "3");
        DIGITAL_NUMBERS.put("   |_|  |", "4");
        DIGITAL_NUMBERS.put(" _ |_  _|", "5");
        DIGITAL_NUMBERS.put(" _ |_ |_|", "6");
        DIGITAL_NUMBERS.put(" _   |  |", "7");
        DIGITAL_NUMBERS.put(" _ |_||_|", "8");
        DIGITAL_NUMBERS.put(" _ |_| _|", "9");
        DIGITAL_NUMBERS.put(" _ | ||_|", "0");
    }

    /**
     * .
     *
     * @param firstLine  of account
     * @param secondLine of account
     * @param thirLine   of account
     * @return number of accunt
     */
    public String accountNumbers(final String firstLine, final String secondLine, final String thirLine) {
        StringBuilder builder = new StringBuilder();
        builder.append(firstLine.substring(ZERO, THREE))
                .append(secondLine.substring(ZERO, THREE))
                .append(thirLine.substring(ZERO, THREE));

        return firstLine.length() == THREE ? DIGITAL_NUMBERS.getOrDefault(builder.toString(), "?")
                : DIGITAL_NUMBERS.getOrDefault(builder.toString(), "?")
                .concat(accountNumbers(firstLine.substring(THREE),
                        secondLine.substring(THREE),
                        thirLine.substring(THREE)));
    }

    /**
     * .
     *
     * @param account for validate.
     * @return true if account is valid.
     */
    public boolean isValidAccount(final String account) {

        numberMulti = TEN;
        int checksum = Arrays.stream(account.split(""))
                .mapToInt(Integer::parseInt).map(this::reduce).sum();

        return checksum % ELEVEN == 0;
    }

    /**
     * that multiply on checksum of account.
     *
     * @param number is a number.
     * @return return multiply.
     */
    public int reduce(final int number) {
        numberMulti -= 1;
        return number * numberMulti;
    }

    /**
     * .
     *
     * @param account is account.
     * @return result of account.
     */
    public String showResults(final String account) {
        if (account.contains("?")) {
            return String.format("%s ILL", account);
        }
        return isValidAccount(account) ? account : String.format("%s ERR", account);
    }
}
