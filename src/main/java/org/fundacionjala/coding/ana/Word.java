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
            StringBuilder wordInto = new StringBuilder(separatedWord);
            wordInvert += separatedWord.length() >= NUMBER ? wordInto.reverse().toString() + " " : separatedWord + " ";
        }
        return wordInvert.trim();
    }

}

