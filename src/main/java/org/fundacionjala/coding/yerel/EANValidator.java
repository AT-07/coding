package org.fundacionjala.coding.yerel;

/**
 * this a class EANValidator.
 */
public class EANValidator {
    private static final int MODULE = 10;
    private static final int MULTIPLICATION = 3;

    /**
     * @param code it is a number code calculate.
     * @return true or false if number code is a checksum.
     */
    public boolean validate(final String code) {
        int add = 0;
        int ultimoDigito = Integer.parseInt(code.substring(code.length() - 1));
        String[] arrayDigit = code.split("");
        for (int i = 0; i < arrayDigit.length - 1; i++) {
            int number = Integer.parseInt(arrayDigit[i]);
            add += (i % 2) == 0 ? number : number * MULTIPLICATION;
        }
        int checksum = (add % MODULE == 0) ? 0 : MODULE - (add % MODULE);
        return ultimoDigito == checksum;
    }
}
