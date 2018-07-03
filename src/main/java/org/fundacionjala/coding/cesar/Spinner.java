package org.fundacionjala.coding.cesar;

/**
 *
 * @author admin-hp
 */
public class Spinner {
    private static final String DELIMITER_WHITE_SPACE = " ";
    private static final int CONSTANCE = 4;
    /**
     * @param totalText string that will be introduced.
     * @return string en reverse.
     */
    public String spinWords(final String totalText) {
        String[] resWords = totalText.split(DELIMITER_WHITE_SPACE);
        for (int i = 0; i < resWords.length; i++) {
            if (resWords[i].length() > CONSTANCE) {
                resWords[i] = new StringBuffer(resWords[i]).reverse().toString();
            }
        }
        return String.join(DELIMITER_WHITE_SPACE, resWords);
    }
}
