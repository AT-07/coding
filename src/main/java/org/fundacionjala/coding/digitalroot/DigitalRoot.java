package org.fundacionjala.coding.digitalroot;

/**
 * Clase DigitalRoot que se encarga de calcular recursivamente el numero de sus digitos.
 */
public class DigitalRoot {
    private static final int CONSTANTE_MULTIPLICACION = 10;

    /**
     * Metodo para realizar el calculo recursivo de los digitos.
     *
     * @param numero numero entero.
     * @return result.
     */
    public int digitalRoot(int numero) {
        int res = 0;
        while (numero > 0) {
            res = res + numero % CONSTANTE_MULTIPLICACION;
            numero = numero / CONSTANTE_MULTIPLICACION;
        }
        return res >= CONSTANTE_MULTIPLICACION ? digitalRoot(res) : res;
    }
}
