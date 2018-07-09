package org.fundacionjala.coding.cesar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author admin-hp
 */
public class CamelCase {
    /**
     * @param cadena entering string.
     * @return chain that was modified .
     */
    public String camelCase(final String cadena) {
        List<String> lst = Arrays.asList(cadena.split(" "));
        return String.join("", lst.stream().map(i -> i.length() > 1
                ? new StringBuilder()
                .append(i.substring(0, 1).toUpperCase())
                .append(i.substring(1, i.length()).toLowerCase())
                .toString()
                : i.toUpperCase()).collect(Collectors.toList())
        );

    }
}

