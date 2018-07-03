package org.fundacionjala.coding.cesar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin-hp
 */

public class Sort {
    private static final int LIMIT = 3;

    /**
     * @param totalText cadena que ingresa para que sea ordenado.
     * @return return en string que ya fue modificado.
     */

    String sortTheInnerContent(final String totalText) {
        List<String> resWords = new ArrayList<>();
        for (String word : totalText.split(" ")) {
            resWords.add(word.length() >= LIMIT ? innerContent(word) : word);
        }
        return String.join(" ", resWords);
    }

    /**
     *
     * @param word ingresa valor array desordenado.
     * @return retorna en array ordenado.
     */
    private String innerContent(final String word) {
        String[] innerContent = word.substring(1, word.length() - 1).split("");
        Arrays.sort(innerContent, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        StringBuilder sb = new StringBuilder();
        sb.append(word, 0, 1);
        sb.append(String.join("", innerContent));
        sb.append(word, word.length() - 1, word.length());
        return sb.toString();
    }
}
