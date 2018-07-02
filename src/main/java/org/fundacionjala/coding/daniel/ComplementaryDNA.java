package org.fundacionjala.coding.daniel;

/**
 * Given a DNA or DNA chain that is ATGC, find its opposite that would be TACG.
 * where A is replaced by T, T by A, C by G and G by C.
 */
public class ComplementaryDNA {

    /**
     * Method  that reverses the DNA chain in its opposite.
     *
     * @param cadenaADN sequence DNA ATCG.
     * @return cadena opuesta TAGC.
     */
    public String secuenciaDNA(String cadenaADN) {
        return cadenaADN.replace("T", "a").replace("A", "t").replace("C", "g").replace("G", "c").toUpperCase();
    }
}

