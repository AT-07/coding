package org.fundacionjala.coding.denis;

/**
 * This is the class principal.
 */
public class DnaStrand {

    /**
     * @param dna is of data working.
     * @return data worked.
     */
    public String makeComplement(final String dna) {
        return dna.replace("A", "t").
                replace("T", "a").replace("C", "g").
                replace("G", "c").toUpperCase();
    }

}
