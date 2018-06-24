package org.fundacionjala.coding.daniel;

/**
 * Clase que sumar digito or digito hasta obtener un valor entre 0 - 9.
 */
public class SumDigitsDigitalRoot {
    private static final int NUMEROMAYOR = 10;

    /**
     * metodo que sumara los digito cada ves que sea mayor igual a 10.
     *
     * @param numeroEntero numero mayor o igual a 0.
     * @return devuelve un entero.
     */
    public int sumarSecuenciaDigito(int numeroEntero) {
        while (numeroEntero >= NUMEROMAYOR) {
            numeroEntero = sumarNumero(numeroEntero);
        }
        return numeroEntero;
    }

    /**
     * metodo que separa los numeros y sumarlos.
     *
     * @param sumar numero a separar.
     * @return un numero entero.
     */
    public int sumarNumero(int sumar) {
        if (sumar >= NUMEROMAYOR) {
            return sumar % NUMEROMAYOR + sumarNumero(sumar / NUMEROMAYOR);
        } else {
            return sumar;
        }
    }

}
