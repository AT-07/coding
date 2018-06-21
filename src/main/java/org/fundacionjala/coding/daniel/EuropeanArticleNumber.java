package org.fundacionjala.coding.daniel;

/**
 * clase European Article Number.
 */
public class EuropeanArticleNumber {
    private static final int IMPAR = 3;
    private static final int MODULO = 10;

    /**
     * metodo que nos dira si es European Article Number.
     *
     * @param cadena parametro de entrada.
     * @return devuelve un arreglo de enteros.
     */
    public boolean esEAN(String cadena) {
        int[] numero = new int[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            numero[i] = (Integer.parseInt(Character.toString(cadena.charAt(i))));
        }
        return verificarEAN(numero);
    }

    /**
     * metodo que recibe un arreglo para verificar si es European Article Number.
     *
     * @param secuencia parametro de entrada de arreglo de numeros.
     * @return devolvera true o false.
     */
    public boolean verificarEAN(int[] secuencia) {
        int suma = 0;
        for (int i = 0; i < secuencia.length - 1; i++) {
            suma += (((i + 1) % 2) == 0) ? (secuencia[i] * IMPAR) : (secuencia[i] * 1);
        }
        return ((MODULO - (suma % MODULO)) == secuencia[secuencia.length - 1]);
    }
}
