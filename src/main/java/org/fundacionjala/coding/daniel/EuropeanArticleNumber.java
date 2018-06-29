package org.fundacionjala.coding.daniel;

/**
 * Clase European Article Number.
 * EAN is a 13-digits barcode consisting of 12-digits data followed by a single-digit checksum .
 * The digits the odd position has to be multiplied with "1".
 * The digits the even position has to be multiplied with "3".
 * If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has.
 * the following formula: sum = 10 - (sum mod 10).
 */
public class EuropeanArticleNumber {
    private static final int MODULO = 10;

    /**
     * Method that will tell us if it is European Article Number.
     *
     * @param cadena String input parameter.
     * @return true or false.
     */
    public boolean esEAN(String cadena) {
        int checkSuma = 0;
        int numeroCadena;
        final int impar = 3;
        String[] secuenciaNumero = cadena.split("");
        int ultimovalor = Integer.parseInt(Character.toString(cadena.charAt(secuenciaNumero.length - 1)));
        for (int i = 0; i < secuenciaNumero.length - 1; i++) {
            numeroCadena = Integer.parseInt(Character.toString(cadena.charAt(i)));
            checkSuma += (i + 1) % 2 == 0 ? numeroCadena * impar : numeroCadena * 1;
        }
        return MODULO - (checkSuma % MODULO) == ultimovalor;
    }
}
