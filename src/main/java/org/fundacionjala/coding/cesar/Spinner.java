package org.fundacionjala.coding.cesar;

/**
 *
 * @author admin-hp
 */
public class Spinner {
    private static final int COM = 4;
    private static String delimiterWhiteSpace = " ";

    /**
     * @param totalText string that will be introduced.
     * @return string en reverse.
     */
    public String spinWords(final String totalText) {

        String[] resWords = totalText.split(delimiterWhiteSpace);
        for (int i = 0; i < resWords.length; i++) {
            if (resWords[i].length() > COM) {
                resWords[i] = new StringBuffer(resWords[i]).reverse().toString();
            }
        }
        return String.join(delimiterWhiteSpace, resWords);
    }
}
