package org.fundacionjala.coding.ean;

/**
 * Esta clase realiza determina si un numero cumple o no la condición EAN.
 */
public class Ean {
    private static final int CONSTANTE_DECIMAL = 10;
    private static final int CONSTANTE_MULTIPLICACION = 3;
    /**
     * Metodo para determinar si cumple o no cumple la condicion.
     *
     * @param numero un String.
     * @return true or false.
     */
    public boolean validate(String numero) {
        long nuevoNumero = Long.parseLong(numero);
        long comparator = nuevoNumero % CONSTANTE_DECIMAL;
        long resultado = 0;
        long posicionPar = 0;
        long posicionImpar = 0;
        while (nuevoNumero > 0) {
            posicionPar += nuevoNumero % CONSTANTE_DECIMAL;
            nuevoNumero = nuevoNumero / CONSTANTE_DECIMAL;
            posicionImpar += nuevoNumero % CONSTANTE_DECIMAL;
            nuevoNumero = nuevoNumero / CONSTANTE_DECIMAL;
        }
        resultado = posicionImpar + posicionPar * CONSTANTE_MULTIPLICACION;
        boolean res = resultado % CONSTANTE_DECIMAL == 0;
        return res || comparator == CONSTANTE_DECIMAL - resultado % CONSTANTE_DECIMAL;
    }
}
