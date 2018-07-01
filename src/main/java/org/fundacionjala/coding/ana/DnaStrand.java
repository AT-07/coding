package org.fundacionjala.coding.ana;

import java.util.HashMap;

/**
 * DNA.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class DnaStrand {
    /**
     * method for the complement of DNA.
     *
     * @param adn string of into.
     * @return  a string.
     */
    public String makeComplement(String adn) {
        StringBuffer getComplement = new StringBuffer();
        HashMap<Character, Character> complementDna = new HashMap<>();
        complementDna.put('C', 'G');
        complementDna.put('G', 'C');
        complementDna.put('T', 'A');
        complementDna.put('A', 'T');
        for (int i = 0; i < adn.length(); i++) {
            getComplement.append(String.valueOf(complementDna.get(adn.charAt(i))));
        }
        return getComplement.toString();
    }

}
