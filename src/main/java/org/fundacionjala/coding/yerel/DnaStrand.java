package org.fundacionjala.coding.yerel;

/**
 * class replace "A" for "T" and "T" for "A".
 * replace "G" for "C" and "C" for "G".
 */
public class DnaStrand {

    /**
     * @param dna is a AND to convert.
     * @return ADN convert.
     */
    public String makeComplement(final String dna) {
        return dna.replaceAll("A", "O").replaceAll("T", "A")
                .replaceAll("O", "T").replaceAll("G", "O")
                .replaceAll("C", "G").replaceAll("O", "C");
    }
}
