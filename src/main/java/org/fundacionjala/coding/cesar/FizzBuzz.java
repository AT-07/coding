package org.fundacionjala.coding.cesar;

import java.util.ArrayList;

import java.util.stream.Collectors;

/**
 *
 * @author admin-hp
 */
public class FizzBuzz {
    private static final int FIVE = 5;
    private static final int THREE = 3;
    /**
     * @param range List from int.
     * @return list String replace.
     */
    public ArrayList<String> doBuzzFizz(final ArrayList<Integer> range) {
        return range
                .stream()
                .map(i -> this.getRespectiveFizzBuzz(i))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     *
     * @param i value input method for remplaze
     * @return value change.
     */
    public String getRespectiveFizzBuzz(int i) {
        if (i % FIVE == 0 && i % THREE == 0) {
            return "fizzbuzz";
        }
        if (i % FIVE == 0) {
            return "buzz";
        }
        if (i % THREE == 0) {
            return "fizz";
        }
        return Integer.toString(i);
    }
}
