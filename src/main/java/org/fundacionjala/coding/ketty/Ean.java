package org.fundacionjala.coding.ketty;

/**
 * @author ketty camcho Vasquez.
 */

public class Ean {
    /**
     * El  eanOperation, verify if is  string number is "EAN".
     *
     * @param num is the is a number string.
     * @return a boolean,  true if the String number is "EAN" and false when it is not an "EAN".
     */
    public boolean eanOperation(final String num) {
        final int oodNumber = 1;
        final int evenNumber = 3;
        final int ten = 10;
        int index = 1;
        int sum = 0;
        String[] newNumber = num.split("");
        for (int i = 0; i < newNumber.length - 1; i++) {
            if (index % 2 == 0) {
                sum += Integer.parseInt(newNumber[i]) * evenNumber;
                index++;
            } else {
                sum += Integer.parseInt(newNumber[i]) * oodNumber;

                index++;
            }
        }

        int x = Integer.parseInt(newNumber[newNumber.length - 1]);

        int answere = sum % ten == 0 ? 0 : ten - (sum % ten);


        return x == answere;
    }
}
