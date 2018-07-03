package org.fundacionjala.coding.erik;

/**
 * this class complement dna.
 * */
public class Dna {
    /**
     * this method is for makeComplement.
     * @param dna is a string.
     * @return complement dna.
     */
    public String makeComplement(final String dna) {
        return dna.replace('T', ' ').replace('A', 'T')
                .replace(' ', 'A').replace('C', ' ').replace('G', 'C').replace(' ', 'G');
    }
}
