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
     * @param cadena is a string that receives as a parameter a pattern of DNA characters
     * @return returns the complement of the DNA string.
     */
    public String dnaComplement(String cadena) {
        StringBuilder complement = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            complement.append(MAPS.get(cadena.charAt(i)));
        }
        return complement.toString();
    }
}
