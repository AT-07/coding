package org.fundacionjala.coding.yerel;

import java.util.Arrays;

/**
 * this class inner content desending.
 */
public class WordOrder {

    private static final int INDEX_ONE = 1;
    private static final String SPACE = " ";
    private static final int INDEX_ZERO = 0;

    /**
     * @param sentence a inner content.
     * @return content inner desendig.
     */
    public String innerContent(String sentence) {
        StringBuilder words;
        StringBuilder newWord = new StringBuilder();
        String cutWord;
        String[] cutSentence = sentence.split(SPACE);
        for (int i = INDEX_ZERO; i < cutSentence.length; i++) {
            words = new StringBuilder(cutSentence[i]);
            cutWord = desedingOrder(words.substring(INDEX_ONE, words.length() - INDEX_ONE));
            words = words.delete(1, words.length() - INDEX_ONE);
            words = words.insert(INDEX_ONE, cutWord);
            newWord.append(words);
            newWord.append(SPACE);
        }
        return newWord.toString().substring(INDEX_ZERO, newWord.length() - INDEX_ONE);
    }

    /**
     * @param word is a convert descending.
     * @return desending word.
     */
    public String desedingOrder(String word) {
        StringBuilder wordDesending = new StringBuilder();
        char[] arrChar = word.toCharArray();
        Arrays.sort(arrChar);
        for (int i = arrChar.length - INDEX_ONE; i >= INDEX_ZERO; i--) {
            wordDesending.append(arrChar[i]);
        }
        return wordDesending.toString();
    }
}
