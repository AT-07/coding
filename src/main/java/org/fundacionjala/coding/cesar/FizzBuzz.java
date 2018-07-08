package org.fundacionjala.coding.cesar;

import java.util.List;
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
    public List<String> doBuzzFizz(final List<Integer> range) {

        List<String> lst = range
                .stream()
                .map(i -> Integer.toString(i))
                .collect(Collectors.toList());
        return lst.stream()
                .map(i ->
                        this.isStringNumber(i) && Integer.parseInt(i)
                                % FIVE == 0 && Integer.parseInt(i) % THREE == 0 ? "fizzbuzz" : i
                )
                .map(i ->
                        this.isStringNumber(i) && Integer.parseInt(i)
                                % FIVE == 0 ? "buzz" : i
                )
                .map(i ->
                        this.isStringNumber(i) && Integer.parseInt(i) % THREE == 0 ? "fizz" : i
                )
                .collect(Collectors.toList());
    }

    /**
     *
     * @param e value for evaluation.
     * @return value true or false.
     */
    public boolean isStringNumber(final String e) {
        try {
            Integer.parseInt(e);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
