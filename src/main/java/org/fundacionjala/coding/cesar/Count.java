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
     * @param chr count the number of times that character appears in the string.
     * @return cont to return.
     */
    public int countChar(final String cadena, final String chr) {
        List<String> lst = Arrays.asList(cadena.toLowerCase().split(""));
        return Collections.frequency(lst, chr);
    }
}
