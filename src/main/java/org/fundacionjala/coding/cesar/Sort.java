package org.fundacionjala.coding.cesar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author admin-hp
 */

public class Sort {
    /**
     *
     * @param totalText cadena que ingresa para que sea ordenado.
     * @return Retorna en string que ya fue modificado.
     */

    public String sortTheInnerContent(String totalText) {

        final int menor = 3;

        ArrayList<String> resWords = new ArrayList<>();

        for (String i : totalText.split(" ")) {

            if (i.length() >= menor) {

                String pre = i.substring(0, 1);

                String end = i.substring(i.length() - 1, i.length());

                String body = i.substring(1, i.length() - 1);

                String[] body2 = body.split("");

                Arrays.sort(body2, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

                body = String.join("", body2);

                resWords.add(pre + body + end);

            } else {
                resWords.add(i);
            }

        }

        return String.join(" ", resWords);

    }
}
