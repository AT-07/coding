package org.fundacionjala.coding.daniel;

/**
 * Given a string of one or more words, you are asked to return the same string.
 * but with inverted the letters that haved a size larget than or equal to 5.
 */
public class StopGninnipsMySdrow {
    private static final int TAMANIO = 5;

    /**
     * Method that compare the  word by word.
     * verifying  his size, if they are older that 5 invest them.
     *
     * @param cadena receives text complete.
     * @return the entire chain inverted.
     */
    public String invertirCadenaCompleta(final String cadena) {
        String[] fragmentado = cadena.split(" ");
        String resultado = "";
        for (int i = 0; i < fragmentado.length; i++) {
            if (fragmentado[i].length() >= TAMANIO) {
                StringBuilder cadenaCompleta = new StringBuilder(fragmentado[i]).reverse();
                resultado += cadenaCompleta.append(" ").toString();
            } else {
                resultado += fragmentado[i] + " ";
            }
        }
        return resultado.trim();
    }
}
