package org.fundacionjala.coding.cesar;

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
    String makeComplement(final String dna) {
        return dna.replace("A", "t").replace("T", "a")
                .replace("C", "g").replace("G", "c").toUpperCase();
    }
}
