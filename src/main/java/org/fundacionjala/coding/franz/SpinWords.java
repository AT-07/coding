package org.fundacionjala.coding.franz;

/**
 * This is a class for Spin words.
 */
public class SpinWords {
    private static final int LIMIT_TAM = 4;

    /**
     * this method is a spin words.
     *
     * @param sentence is the words that use for excercise
     * @return words reverse if is a length major to 5 for word
     */
    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder wordComplete = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            wordComplete.append(reverseWord(words[i])).append(" ").toString();
        }
        return wordComplete.toString().trim();
    }

    /**
     * this method reverse a word.
     *
     * @param word is a word that need reverse
     * @return the word reverse
     */
    public String reverseWord(String word) {
        return word.length() > LIMIT_TAM ? new StringBuilder(word).reverse().toString()
                : new StringBuilder(word).toString();
    }
}
