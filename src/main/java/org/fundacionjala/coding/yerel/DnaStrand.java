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
    public String makeComplement(String dna){
        String dnaCopy = dna;
        dnaCopy = dna.replaceAll("A", "O").replaceAll("T","A")
                .replaceAll("O","T").replaceAll("G","O")
                .replaceAll("C", "G").replaceAll("O","C");
        return dnaCopy;
    }
}
