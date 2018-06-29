package org.fundacionjala.coding.dnacomplement;

import java.util.HashMap;
import java.util.Map;

/**
 * DnaComplement class that returns the complement of a DNA string.
 */
public class DnaComplement {

    /**
     * I declare a static Map.
     */
    static final Map<Character, Character> MAPS = new HashMap<>();

    /**
     * I add to the static Map.
     */
    static {
        MAPS.put('A', 'T');
        MAPS.put('T', 'A');
        MAPS.put('C', 'G');
        MAPS.put('G', 'C');
    }

    /**
     * DnaComplement method that returns the complement of a DNA string.
     *
     * @param string is a String that receives as a parameter a string of DNA characters
     * @return returns the complement of the DNA string.
     */
    public String dnaComplement(final String string) {
        StringBuilder complement = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            complement.append(MAPS.get(string.charAt(i)));
        }
        return complement.toString();
    }
}
