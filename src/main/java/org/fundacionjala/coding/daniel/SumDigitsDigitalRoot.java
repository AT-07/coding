package org.fundacionjala.coding.daniel;

/**
 * Class that add up to the digits of sequence of number until be minor than 10.
 */
public class SumDigitsDigitalRoot {
    private static final int NUMEROMAYOR = 10;

    /**
     * Method that separate the numbers and add up.
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
