package org.fundacionjala.coding.cesar;

/**
 *
 * @author admin-hp
 */
public class Spinner {
    private static final int COM = 4;

    /**
     *
     * @param totalText string that will be introduced.
     * @return string en reverse.
     */
    public String spinWords(String totalText) {

        String[] resWords = new String[totalText.split(" ").length];

        int tam = 0;

        for (String i : totalText.split(" ")) {

            int lenCaracs = i.split("").length;

            String aux = i;

            if (lenCaracs > COM) {

                aux = new StringBuffer(i).reverse().toString();

            }

            resWords[tam] = aux;

            tam = tam + 1;

        }
        return String.join(" ", resWords);
    }
}
