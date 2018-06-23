package org.fundacionjala.coding.spinwords;

/**
 * Clase SpinWords que trabaja con cadenas.
 */
public class SpinWords {

    private static final int TAMANO_LIMITE = 5;
    /**
     * Metodo para revertir aquellas palabras en un String que su tamaño sea mas de 5 caracteres.
     * @param cadena un String.
     * @return result.
     */
    public String spinWords(String cadena) {

        StringBuilder result = new StringBuilder();
        StringBuilder variableTemporal = new StringBuilder();
        String[] campos = cadena.split("\\s+");
        for (int i = 0; i < campos.length; i++) {
            variableTemporal.append(campos[i]);
            if (variableTemporal.length() < TAMANO_LIMITE) {
                result.append(variableTemporal.append(" "));
                variableTemporal.delete(0, variableTemporal.length());
            } else {
                result.append(variableTemporal.reverse().append(" "));
                variableTemporal.delete(0, variableTemporal.length());
            }
        }
        return result.toString();
    }
}
