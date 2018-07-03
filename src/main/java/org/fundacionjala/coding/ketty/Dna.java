package org.fundacionjala.coding.ketty;

/**
 * class Dna.
 *
 * @author ketty Camacho V.
 */

public class Dna {
    /**
     * @param phrase of String.
     * @return a string phrase.
     */
    public String dna(final String phrase) {
        return phrase.replace('T', 'a').replace('A', 't').replace('C', 'g').replace('G', 'c').toUpperCase();
    }
}

