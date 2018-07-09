package org.fundacionjala.coding.denis;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * @author Denis. Class principal of Kata ineerContent.
 */
public class Kata {
    private static final int POSONE = 1;
    private static final int POSZERO = 0;
    private static final int SIZE = 3;

    /**
     * @param words is the string with the method work.
     * @return words validation.
     */
    public String sortTheInnerContent(final String words) {
        String[] wordsPart = words.split(" ");
        StringJoiner wordsRes = new StringJoiner(" ");

        for (String wordPart : wordsPart) {

            wordsRes.add(wordPart.length() <= SIZE ? wordPart : innerWord(wordPart));
        }
        return wordsRes.toString();
    }

    /**
     * @param wordPart is the string with the method work.
     * @return word invest.
     */
    private String innerWord(final String wordPart) {
        final String[] words = wordPart.substring(POSONE, wordPart.length() - POSONE)
                .split("");
        Arrays.sort(words, Collections.reverseOrder());
        return String.valueOf(wordPart.charAt(POSZERO))
                .concat(String.join("", words))
                .concat(String.valueOf(wordPart.charAt(wordPart.length() - POSONE)));
    }

}
