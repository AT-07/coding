package org.fundacionjala.coding.daniel;

/**
 * Class that multiplies all the digits of a whole number.
 * until a single digit number is obtained.
 */
public class PersistentBugger {
    private static final int MODULO = 10;

    /**
     * Method that calculates how many times a number is multiplied.
     *
     * @param numeroEntero positive natural number.
     * @return number of times multiplied.
     */
    public int cantidadMultiplicada(int numeroEntero) {
        int cantidad = 0;
        while (numeroEntero >= MODULO) {
            int multiplicacion = 1;
            while (numeroEntero != 0) {
                multiplicacion *= numeroEntero % MODULO;
                numeroEntero /= MODULO;
            }
            cantidad++;
            numeroEntero = multiplicacion;
        }
        return cantidad;
    }
}
