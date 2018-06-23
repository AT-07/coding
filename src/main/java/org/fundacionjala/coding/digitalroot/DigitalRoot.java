package org.fundacionjala.coding.digitalroot;

/**
 * Clase DigitalRoot que se encarga de calcular recursivamente el numero de sus digitos.
 */
public class DigitalRoot {
    private static final int CONSTANTE_MULTIPLICACION = 10;

    /**
     * Metodo para realizar el calculo recursivo de los digitos.
     * @param numero numero entero.
     * @return result.
     */
    public int digitalRoot(int numero) {
        int result = sum(numero);
        if (result >= CONSTANTE_MULTIPLICACION) {
            result = digitalRoot(result);
        }
        return result;
    }

    /**
     * Metodo para realizar el calculo de los suma de digitos de un numero.
     * @param numero numero entero.
     * @return result.
     */
    public int sum(int numero) {
        int result = 0;
        while (numero > 0) {
            result = result + numero % CONSTANTE_MULTIPLICACION;
            numero = numero / CONSTANTE_MULTIPLICACION;
        }
        return result;
    }
}
