package org.fundacionjala.coding.ana;

import java.util.HashMap;

/**
 * DNA.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class DnaStrand {
    private static final HashMap<Character, Character> COMPLEMENTDNA = new HashMap<>();

    static {
        COMPLEMENTDNA.put('C', 'G');
        COMPLEMENTDNA.put('G', 'C');
        COMPLEMENTDNA.put('T', 'A');
        COMPLEMENTDNA.put('A', 'T');
    }

    /**
     * method for the complement of DNA.
     *
     * @param adn string of into.
     * @return a string.
     */
    public String makeComplement(final String adn) {

        StringBuilder getComplement = new StringBuilder();
        for (int i = 0; i < adn.length(); i++) {
            getComplement.append(String.valueOf(COMPLEMENTDNA.get(adn.charAt(i))));
        }
        return getComplement.toString();
    }

}
