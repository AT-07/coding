package org.fundacionjala.coding.yerel;
/**
 * this a class EANValidator.
 */
public class EANValidator {
    public static final int MODULE = 10;
    public static final int MULTIPLICATION = 3;


    /**
     * @param code it is a number code calculate.
     * @return true or false if number code is a checksum.
     */
    public boolean validator(String code) {
        int ultimoDigito = Integer.parseInt(code.substring(code.length() - 1));
        int codeDiv = sumNumbersCode(code.substring(0, code.length() - 1));
        int checksum = (codeDiv % MODULE == 0) ? 0 : MODULE - (codeDiv % MODULE);
        return ultimoDigito == checksum;
    }

    /**
     * @param code it is a number code calculate without lasted number.
     * @return int a added odd and even.
     */
    public int sumNumbersCode(String code) {
        int suma = 0;
        String[] cadenaCode = code.split("");

        for (int i = 0; i < cadenaCode.length; i++) {

            int number = Integer.parseInt(cadenaCode[i]);
            suma += i % 2 == 0 ? number : number * MULTIPLICATION;
        }
        return suma;
    }
}
