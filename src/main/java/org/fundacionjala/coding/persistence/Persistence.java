package org.fundacionjala.coding.persistence;

/**
 * Clase que se encarga de realizar calculos persistentes multiplicativos dado un numero de entrada.
 */
public class Persistence {
    public static final int CONSTANTE_MULTIPLICACION = 10;
    public static final int CONSTANTE_VERIFICACION = 9;


    /**
     * Metodo que realiza las multiplicaciones persistentes.
     *
     * @param numero es un int.
     * @return contador.
     */
    public int persistence(int numero) {
        int contador = 0;
        int result = multiplication(numero);
        if (numero > 0 && numero < CONSTANTE_MULTIPLICACION) {
            return 0;
        } else {
            contador = 1;
            while (result > CONSTANTE_VERIFICACION) {
                contador++;
                result = multiplication(result);
            }
        }
        return contador;
    }

    /**
     * Metodo que se encarga de realizar la multiplicacion de todos sus digitos.
     *
     * @param numero es un int.
     * @return result.
     */
    public int multiplication(int numero) {
        int result = 1;
        while (numero > 0) {
            result *= numero % CONSTANTE_MULTIPLICACION;
            numero = numero / CONSTANTE_MULTIPLICACION;
        }
        return result;

    }
}
