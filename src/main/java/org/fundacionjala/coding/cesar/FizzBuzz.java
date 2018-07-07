package org.fundacionjala.coding.cesar;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin-hp
 */
public class FizzBuzz {
    private static final int FIVE = 5;
    private static final int TREE = 3;
    /**
     * @param range List from int.
     * @return list String replace.
     */
    public List<String> doBuzzFizz(final List<Integer> range) {

        return range.stream().map(i -> i % FIVE == 0 & i % TREE == 0
                ? "fizzbuzz"

                : i % FIVE == 0
                ? "buzz"

                : i % TREE == 0
                ? "fizz"

                : Integer.toString(i)
        ).collect(Collectors.toList());

    }
}
