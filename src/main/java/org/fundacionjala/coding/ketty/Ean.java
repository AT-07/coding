package org.fundacionjala.coding.ketty;

/**
 * @author ketty camcho Vasquez.
 */

public class Ean {

    private static final int POSITION_PAR = 3;
    private static final int POSITION_IMPAR = 1;

    /**
     * El  eanOperation, verify if is  string number is "EAN".
     *
     * @param num is the is a number string.
     * @return a boolean,  true if the String number is "EAN" and false when it is not an "EAN".
     */
    public boolean eanOperation(final String num) {

        final int ten = 10;
        int sum = 0;

        String[] numberArray = num.split("");

        for (int i = 0; i <= numberArray.length - 2; i++) {

            sum += getEANNumber(Integer.parseInt(numberArray[i]), i + 1);
        }

        int value = (sum % ten) == 0 ? 0 : ten - (sum % ten);

        return Integer.parseInt(numberArray[numberArray.length - 1]) == value;
    }

    /**
     * @param number it is  String number.
     * @param index  value of sum.
     * @return a value int.
     */

    public int getEANNumber(int number, int index) {
        return index % 2 == 0 ? number * POSITION_PAR : number * POSITION_IMPAR;
    }
}
