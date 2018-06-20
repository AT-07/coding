package org.fundacionjala.coding.daniel;

/**
 * Clase que verifica si es o no una kata.
 *
 * @author Daniel Sandoval Peñaloza.
 */
public class Kadal {
    private static final int IMPAR = 3;
    private static final int MODULO = 10;

    /**
     * metodo que convertira mi cadena en un arreglo de numeros.
     *
     * @param secuencia secuencia de numeros.
     * @return devolvera true o false.
     */
    public boolean esKadal(int[] secuencia) {
        int suma = 0;
        for (int i = 0; i < secuencia.length - 1; i++) {
            if (((i + 1) % 2) == 0) {
                suma += (secuencia[i] * IMPAR);
            } else {
                suma += (secuencia[i] * 1);
            }
        }
        return ((MODULO - (suma % MODULO)) == secuencia[secuencia.length - 1]);
    }

    /**
     * metodo que combierte cadena en arreglo de enteros.
     *
     * @param cadena valor de entrada.
     * @return devuelve un arreglo de enteros.
     */
    public boolean arregloCadena(String cadena) {
        int[] numero = new int[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            numero[i] = (Integer.parseInt(Character.toString(cadena.charAt(i))));
        }
        return esKadal(numero);
    }

}
