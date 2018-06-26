package org.fundacionjala.coding.digitalroot;

/**
 * Class DigitalRoot that is responsible for recursively calculate the number of your digits.
 */
public class DigitalRoot {
    private static final int CONSTANTE_MULTIPLICACION = 10;

    /**
     * Method to perform the recursive addition of the digits of a number.
     *
     * @param numero whole inserted as parameter.
     * @return result which is the recursive sum of a given number.
     */
    public int digitalRoot(int numero) {
        int result = 0;
        while (numero > 0) {
            result = result + numero % CONSTANTE_MULTIPLICACION;
            numero = numero / CONSTANTE_MULTIPLICACION;
        }
        return result >= CONSTANTE_MULTIPLICACION ? digitalRoot(result) : result;
    }
}
