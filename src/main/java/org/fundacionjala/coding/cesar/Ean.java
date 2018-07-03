package org.fundacionjala.coding.cesar;

/**
 * @author admin-hp
 */
public class Ean {
    private static final int MPLT_IMPAR = 3;
    private static final int MPLT_MOD = 10;

    /**
     * @param cadena Variable to be processed.
     * @return Falso o true process value.
     */
    public boolean validar(final String cadena) {
        String[] numbers = cadena.substring(0, cadena.length() - 1).split("");
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            sum += num % 2 == 0 ? num : num * MPLT_IMPAR;
        }
        int checkSum = sum % MPLT_MOD == 0 ? 0 : MPLT_MOD - sum % MPLT_MOD;
        int lastDigit = Integer.parseInt(cadena.substring(cadena.length() - 1));
        return checkSum == lastDigit;
    }
}
