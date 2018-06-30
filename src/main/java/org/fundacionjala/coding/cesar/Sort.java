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
    /**
     *
     * @param totalText cadena que ingresa para que sea ordenado.
     * @return Retorna en string que ya fue modificado.
     */

    public String sortTheInnerContent(final String totalText) {

        final int menor = 3;

        List resWords = new ArrayList<>();

        for (String i : totalText.split(" ")) {

            if (i.length() >= menor) {

                String body = i.substring(1, i.length() - 1);
                String[] body2 = body.split("");
                Arrays.sort(body2, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
                body = String.join("", body2);
                StringBuilder sb = new StringBuilder();
                sb.append(i.substring(0, 1));
                sb.append(body);
                sb.append(i.substring(i.length() - 1, i.length()));
                resWords.add(sb.toString());

            } else {
                resWords.add(i);
            }

        }

        return String.join(" ", resWords);

    }
}
