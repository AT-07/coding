package org.fundacionjala.coding.ana;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Word {
    private static final int NUMBER = 5;

    /**
     * A word that has more than 5 letters is inverted.
     *
     * @param words enter the value "this is another test".
     * @return a string.
     */
    public String stringWords(String words) {
        String wordInvert = "";
        for (String separatedWord : words.split(" ")) {
            StringBuilder word = new StringBuilder(separatedWord);
            wordInvert += word.length() >= NUMBER ? word.reverse().append(" ").toString() : word.append(" ").toString();
        }
        return wordInvert.trim();
    }

}

