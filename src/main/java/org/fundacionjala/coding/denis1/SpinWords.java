package org.fundacionjala.coding.denis1;

/**
 * class SpinWords.
 */
public class SpinWords {
    private static final int ZISEWORD = 5;

    /**
     * invest of the words.
     *
     * @param sentence OF STRING INVEST.
     * @return string.
     */
    public String stopSpinWords(String sentence) {

        String wordInvertido = "";
        String[] wordsParts = sentence.split(" ");
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < wordsParts.length; i++) {
            word.append(wordsParts[i]);
            if (word.length() < ZISEWORD) {
                wordInvertido += word.append(" ").toString();
                word.delete(0, word.length());
            } else {
                wordInvertido += word.reverse().append(" ").toString();
                word.delete(0, word.length());
            }

        }

        return wordInvertido.trim();

    }
}
