package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * this is a Junit planet.
 */
public class PlanetTest {

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
        final Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }

    /**
     * this a test for a array {9,2,4,7,3}.
     */
    @Test
    public void sortTwisted37Two() {
        final Integer[] array = {9, 2, 4, 7, 3};
        final Integer[] expected = {2, 7, 4, 3, 9};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }

    /**
     * this a test for a array {12,13,14}.
     */
    @Test
    public void sortTwisted37Three() {
        final Integer[] array = {12, 13, 14};
        final Integer[] expected = {12, 14, 13};
        assertArrayEquals(expected, planet.sortTwisted37(array));
    }
}
