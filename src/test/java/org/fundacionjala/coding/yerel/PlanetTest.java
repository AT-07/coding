package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * this is a Junit planet.
 */
public class PlanetTest {
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_FOUR = 4;
    private static final int NUMBER_FIVE = 5;
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_SEVEN = 7;
    private static final int NUMBER_EIGTH = 8;
    private static final int NUMBER_NINE = 9;
    private static final int NUMBER_TWELVEN = 12;
    private static final int NUMBER_THIRTEEN = 13;
    private static final int NUMBER_FOURTEEN = 14;

    private Planet planet;

    /**
     * this method before inizilalize class Planet.
     */
    @Before
    public void setUp() {
        planet = new Planet();
    }

    /**
     * this a test for a array {1,2,3,4,5,6,7,8,9}.
     */
    @Test
    public void sortTwisted37() {
        Integer[] array = {NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIVE,
                            NUMBER_SIX, NUMBER_SEVEN, NUMBER_EIGTH, NUMBER_NINE};
        Integer[] expected = {NUMBER_ONE, NUMBER_TWO, NUMBER_SEVEN, NUMBER_FOUR, NUMBER_FIVE,
                                NUMBER_SIX, NUMBER_THREE, NUMBER_EIGTH, NUMBER_NINE};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }

    /**
     * this a test for a array {9,2,4,7,3}.
     */
    @Test
    public void sortTwisted37Two() {
        Integer[] array = {NUMBER_NINE, NUMBER_TWO, NUMBER_FOUR, NUMBER_SEVEN, NUMBER_THREE};
        Integer[] expected = {NUMBER_TWO, NUMBER_SEVEN, NUMBER_FOUR, NUMBER_THREE, NUMBER_NINE};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }

    /**
     * this a test for a array {12,13,14}.
     */
    @Test
    public void sortTwisted37Three() {
        Integer[] array = {NUMBER_TWELVEN, NUMBER_THIRTEEN, NUMBER_FOURTEEN};
        Integer[] expected = {NUMBER_TWELVEN, NUMBER_FOURTEEN, NUMBER_THIRTEEN};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }
}
