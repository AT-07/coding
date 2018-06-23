package org.fundacionjala.coding.daniel;

/**
 * class invest chains.
 */
public class StopGninnipsMySdrow {
    private static final int TAMANIO = 5;

    /**
     * method main.
     *
     * @param cadena receives text complete.
     * @return the entire chain inverted.
     */
    public String invertirCadenaCompleta(String cadena) {
        String[] separaCadena = cadena.split(" ");
        String nuevaCadena = "";
        for (int i = 0; i < separaCadena.length; i++) {
            if (separaCadena[i].length() >= TAMANIO) {
                separaCadena[i] = invertir(separaCadena[i]);
            }
            nuevaCadena += separaCadena[i] + " ";
            System.out.println("preuba: " + separaCadena[i]);
        }
        return nuevaCadena.trim();
    }

    /**
     * Method that will invest a chain.
     *
     * @param cadena string.
     * @return returns the inverted string.
     */
    public String invertir(String cadena) {
        StringBuffer invertido = new StringBuffer();
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertido.append(cadena.charAt(i));
            //inversa += cadena.charAt(i);
        }
        //return inversa;
        inversa = invertido.toString();
        return inversa;
        /*
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < field.length; ++i) {
        buf.append(field[i]);
        }
         String s = buf.toString();
         */
    }

}
