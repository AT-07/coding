package org.fundacionjala.coding.daniel;

/**
 * clase que multiplica todos los digitos de un numero entero.
 */
public class PersistentBugger {
    private static final int MODULO = 10;

    /**
     * Metodo que calcula cuantas veces se multiplica un numero.
     *
     * @param numeroEntero numero natural positivo.
     * @return cantidad de veces multiplicadas.
     */
    public int cantidadMultiplicada(int numeroEntero) {
        int cantidad = 0;
        while (numeroEntero >= MODULO) {
            cantidad++;
            numeroEntero = multiplicarNumero(numeroEntero);
        }
        return cantidad;
    }

    /**
     * metodo que separa los numeros y los multiplica.
     *
     * @param multiplicar numero a separar.
     * @return un numero entero.
     */
    public int multiplicarNumero(int multiplicar) {
        if (multiplicar >= MODULO) {
            return multiplicar % MODULO * multiplicarNumero(multiplicar / MODULO);
        } else {
            return multiplicar;
        }
    }

}
