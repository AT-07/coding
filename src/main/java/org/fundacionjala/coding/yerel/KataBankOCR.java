package org.fundacionjala.coding.yerel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this class convert a String pipes and underscores
 * and the fourth line is blank. Each account number should have 9 digits, all of which should be in the range 0-9.
 */
public class KataBankOCR {
    private static final int NUMBER_TWENTYSEVEN = 27;
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_ELEVEN = 11;
    private static final int NUMBER_THREE = 3;
    private static final Map<String, String> MAP = new HashMap<>();

    static {
        MAP.put(" _ | ||_|", "0");
        MAP.put("     |  |", "1");
        MAP.put(" _  _||_ ", "2");
        MAP.put(" _  _| _|", "3");
        MAP.put("   |_|  |", "4");
        MAP.put(" _ |_  _|", "5");
        MAP.put(" _ |_ |_|", "6");
        MAP.put(" _   |  |", "7");
        MAP.put(" _ |_||_|", "8");
        MAP.put(" _ |_| _|", "9");
    }

    /**
     * @param number number pipes and underscores String.
     * @return number String convert.
     */
    public String accountNumber(final String number) {
        List<String> listDigit = new ArrayList<>();
        StringBuilder numberString = new StringBuilder();
        int oneNumberCount = 0;
        while (oneNumberCount < NUMBER_TWENTYSEVEN) {
            StringBuilder onlyNumberChar = new StringBuilder();
            String[] divNum = number.split("\n");
            for (String partNumber : divNum) {
                onlyNumberChar.append(partNumber, oneNumberCount, oneNumberCount + NUMBER_THREE);
            }
            listDigit.add(onlyNumberChar.toString());
            oneNumberCount += NUMBER_THREE;
        }
        for (String list : listDigit) {
            numberString.append(MAP.getOrDefault(list, "?"));
        }
        return numberString.toString();
    }

    /**
     * @param number number in String.
     * @return String concat with value err o ill.
     */
    public String seeResult(final String number) {
        if (number.contains("?")) {
            return String.join(" ", number, "ILL");
        }
        return checksumValidate(number) ? number : String.join(" ", number, "ERR");
    }

    /**
     * @param number is a number account.
     * @return boolean is checksumValidate true or false.
     */
    public boolean checksumValidate(final String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i)) * (number.length() - i);
        }
        return sum % NUMBER_ELEVEN == NUMBER_ZERO;
    }
}
