package org.fundacionjala.coding.EAN;

/**
 * Esta clase ghfhf.
 */
public class EAN {
    private static final int CONSTANTE_DECIMAL = 10;
    private static final int CONSTANTE_MULTIPLICACION = 3;
    private static final int CONSTANTE_ZERO = 0;
    /**
     * Metodo para determinar si cumple o no cumple la condicion.
     *
     * @param numero un String.
     * @return true or false.
     */
    public boolean validate(String numero) {
        long numeroConvertido = Long.parseLong(numero);
        long comparator = numeroConvertido % CONSTANTE_DECIMAL;
        long nuevoNumero = numeroConvertido / CONSTANTE_DECIMAL;
        long resultado = 0;
        long posicionPar = 0;
        long posicionImpar = 0;
        while (nuevoNumero > CONSTANTE_ZERO) {
            posicionPar += nuevoNumero % CONSTANTE_DECIMAL;
            nuevoNumero = nuevoNumero / CONSTANTE_DECIMAL;
            posicionImpar += nuevoNumero % CONSTANTE_DECIMAL;
            nuevoNumero = nuevoNumero / CONSTANTE_DECIMAL;
        }
        resultado = posicionImpar + posicionPar * CONSTANTE_MULTIPLICACION;
        boolean res = resultado % CONSTANTE_DECIMAL == CONSTANTE_ZERO;
        return (res || (comparator == (CONSTANTE_DECIMAL - (resultado % CONSTANTE_DECIMAL)))) ? true : false;
    }
}
