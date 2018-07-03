package org.fundacionjala.coding.yerel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * this class convert a String pipes and underscores
 * and the fourth line is blank. Each account number should have 9 digits, all of which should be in the range 0-9.
 */
public class KataBankOCR {
    private static final int NUMBER_TWENTYSEVEN = 27;
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_TEEN = 10;
    private static final int NUMBER_ELEVEN = 11;
    private static final int NUMBER_THREE = 3;
    private static final String INTEROGATION = "?";

    /**
     * @param number number pipes and underscores String.
     * @return number String convert.
     */
    public String accountNumber(String number) {
        List<StringBuilder> listDigit = new ArrayList<>();
        int oneNumberCount = 0;
        while (oneNumberCount < NUMBER_TWENTYSEVEN) {
            StringBuilder onlyNumberChar = new StringBuilder();
            String[] divNum = number.split("\n");
            for (String partNumber: divNum) {
                onlyNumberChar.append(partNumber, oneNumberCount, oneNumberCount + NUMBER_THREE);
            }
            listDigit.add(onlyNumberChar);
            oneNumberCount += NUMBER_THREE;
        }
        return convertNumber(listDigit);
    }

    /**
     * @param number Number Pattern List.
     * @return number String.
     */
    public String convertNumber(List<StringBuilder> number) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder numberString = new StringBuilder();
        map.put(" _ | ||_|", "0");
        map.put("     |  |", "1");
        map.put(" _  _||_ ", "2");
        map.put(" _  _| _|", "3");
        map.put("   |_|  |", "4");
        map.put(" _ |_  _|", "5");
        map.put(" _ |_ |_|", "6");
        map.put(" _   |  |", "7");
        map.put(" _ |_||_|", "8");
        map.put(" _ |_| _|", "9");
        for (StringBuilder list: number) {
            numberString.append(map.get(
                    list.toString()) == null ? INTEROGATION : map.get(list.toString()));
        }
        return numberString.toString();
    }

    /**
     * @param number number in String.
     * @return String concat with value err o ill.
     */
    public String checksumValidation(String number) {
        String copyNumber = String.valueOf(number);
        try {
            int sum = 0;
            int cont = 1;
            int numberConver = Integer.parseInt(number);
            while (numberConver > NUMBER_ZERO) {
                sum += (numberConver % NUMBER_TEEN) * cont;
                cont++;
                numberConver /= NUMBER_TEEN;
            }
            return sum % NUMBER_ELEVEN == NUMBER_ZERO
                    ? copyNumber : String.join(" ", copyNumber, "ERR");
        } catch (NumberFormatException excepcion) {
            return String.join(" ", number, "ILL");
        }
    }
}
