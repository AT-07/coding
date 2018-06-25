package org.fundacionjala.coding;

/**
 *
 * @author admin-hp
 */
public class Dna {

    /**
     *
     * @param dna ingresa el dna .
     * @return retorna el dna que se remplazo pero sin afectar a la cadena principal.
     */
    public String makeComplemet(String dna) {
        String dnaux = dna.replace("A", "t").replace("T", "a").replace("C", "g").replace("G", "c").toUpperCase();
        return dnaux;
    }
}
