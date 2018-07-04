package org.fundacionjala.coding.franz;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * this is a class.
 */
public class CamelCase {
    /**
     * .
     * @param word that is a uppercamel
     * @return word
     */
    public String camelCase(final String word) {
        if (word.isEmpty()) {
            return word;
        }

        return Arrays.stream(word.split(" "))
                .map(var -> var.length() > 1 ? var.replaceFirst(var.substring(0, 1), var.substring(0, 1).toUpperCase())
                        : var.toUpperCase()).collect(Collectors.joining());
    }
}
