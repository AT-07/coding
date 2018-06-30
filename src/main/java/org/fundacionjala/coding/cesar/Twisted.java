package org.fundacionjala.coding.cesar;

import java.util.Arrays;
/**
 *
 * @author admin-hp
 */
public class Twisted {

    /**
     *
     * @param numeros Array from Numbers inputs.
     * @return Array replace.
     */
    public int[] sortTwisted(final int[] numeros) {
        String aux = Arrays.toString(numeros).replace("[", "").replace("]", "").replace(" ", "")
                .replace("3", "x").replace("7", "y").replace("x", "7").replace("y", "3").toUpperCase();
        String[] stringArray = aux.split(",");
        Arrays.sort(stringArray);
        aux = Arrays.toString(stringArray).replace("[", "").replace("]", "").replace(" ", "")
                .replace("3", "x").replace("7", "y").replace("x", "7").replace("y", "3").toUpperCase();
        stringArray = aux.split(",");
        return Arrays.asList(stringArray).stream().mapToInt(Integer::parseInt).toArray();
    }

}
