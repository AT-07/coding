package org.fundacionjala.coding.yerel;

/**
 * this class convert word long is major five of sentence.
 */
public class StopSpinWords {

    private static final int LENGTWORD_COVERT = 4;
    private static final String SPACE = " ";
    private static final int WORD_ULTIMATE = 1;

    /**
     * @param sentence is a word to invert.
     * @return word invert.
     */
    public String spinWords(String sentence) {
        String[] wordsSepare = sentence.split(SPACE);
        StringBuilder joinWord = new StringBuilder();
        for (int i = 0; i < wordsSepare.length; i++) {
            joinWord.append(investWords(wordsSepare[i]));
            joinWord.append(" ");
        }
        return joinWord.toString().substring(0, joinWord.length() - WORD_ULTIMATE);
    }

    /**
     * @param word one word the sentence.
     * @return word invert or not it.
     */
    private StringBuilder investWords(String word) {
        StringBuilder spinwords = new StringBuilder();
        spinwords.append(word);
        return spinwords.length() > LENGTWORD_COVERT ? spinwords.reverse() : spinwords;
    }
}
