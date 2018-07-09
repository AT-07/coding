package org.fundacionjala.coding.erik;

/**
 * this is the class camel case.
 */
public class CamelCase {
    /**
     * this is method camel case word.
     *
     * @param str word.
     * @return camel case word.
     */
    public String camelCase(final String str) {
        String[] words = str.split(" ");
        StringBuilder camel = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            camel.append(words[i].replace(words[i].substring(0, 1), words[i].substring(0, 1).toUpperCase()));
        }
        return camel.toString();
    }
}
