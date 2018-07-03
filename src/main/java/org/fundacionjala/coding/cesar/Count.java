package org.fundacionjala.coding.cesar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author admin-hp
 */
public class Count {
    /**
     * @param cadena String precess for count character.
     * @param chr    what Character that is counted.
     * @return cont to return.
     */
    public int countChar(final String cadena, final String chr) {
        List<String> lst = Arrays.asList(cadena.split(""));
        int upper = Collections.frequency(lst, chr.toLowerCase());
        int lower = Collections.frequency(lst, chr.toUpperCase());
        return upper + lower;
    }
}
