package org.fundacionjala.coding.franz;

/**
 * this class is a DNA.
 */
public class ComplementaryDNA {
    private static final String A = "A";
    private static final String T = "T";
    private static final String SPACE = " ";
    private static final String C = "C";
    private static final String G = "G";

    /**
     * this method is about make complement.
     *
     * @param dna is a Stirng that make complement
     * @return a String complement
     */
    String makeComplement(final String dna) {

        return dna.replaceAll(A, SPACE).replaceAll(T, A).replaceAll(SPACE, T)
                .replaceAll(C, SPACE).replaceAll(G, C).replaceAll(SPACE, G);
    }
}
