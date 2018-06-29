package org.fundacionjala.coding.daniel;

/**
 * Given a number n, perform the sum of the digits of n.
 * If the result has two digits, continue reducing in this way until a single digit number is produced.
 * this applies only to natural numbers.
 */
public class SumDigitsDigitalRoot {
    private static final int NUMEROMAYOR = 10;

    /**
     * Method that separate and sum the numbers until a single digit number is produced.
     *
     * @param numero understands positive natural numbers.
     * @return one number.
     */
    public int sumarNumero(int numero) {
        while (numero >= NUMEROMAYOR) {
            numero = numero % NUMEROMAYOR + sumarNumero(numero / NUMEROMAYOR);
        }
        return numero;
    }
}
