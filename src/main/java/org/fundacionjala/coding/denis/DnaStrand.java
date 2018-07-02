package org.fundacionjala.coding.denis;

/**
 * This is the class principal.
 */
public class DnaStrand {
    private static final String A = "A";
    private static final String C = "C";
    private static final String G = "G";
    private static final String T = "T";
    private static final String A1 = "a";
    private static final String T1 = "t";
    private static final String G1 = "g";
    private static final String C1 = "c";


    /**
     * @param dna is of data working.
     * @return data worked.
     */
    public String makeComplement(final String dna) {
        return dna.replace(A, T1).
                replace(T, A1).replace(C, G1).
                replace(G, C1).toUpperCase();
    }

}
