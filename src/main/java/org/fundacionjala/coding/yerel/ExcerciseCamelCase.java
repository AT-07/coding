package org.fundacionjala.coding.yerel;

/**
 * class convert a word in camel case.
 */
public class ExcerciseCamelCase {
    private static final String SPACE = " ";

    /**
     * @param sentece sentence to convert in camel case.
     * @return sentence in camel case.
     */
    public String camelCase(final String sentece) {
        String[] senteceArray = sentece.split(SPACE);
        StringBuilder sentenceCamelCase = new StringBuilder();
        for (String word: senteceArray) {
            sentenceCamelCase.append(word.replaceFirst(String.valueOf(word.charAt(0)),
                    String.valueOf(word.charAt(0)).toUpperCase()));
        }
        return sentenceCamelCase.toString();
    }
}
