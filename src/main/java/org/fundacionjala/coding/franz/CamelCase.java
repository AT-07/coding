package org.fundacionjala.coding.franz;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * this is a class.
 */
public class CamelCase {
    /**
     * .
     * @param str that is a uppercamel
     * @return word
     */
    public String camelCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Arrays.stream(str.split(" "))
                .map(var -> var.length() > 1 ? var.replaceFirst(var.substring(0, 1), var.substring(0, 1).toUpperCase())
                        : var.toUpperCase()).collect(Collectors.joining());
    }
}
