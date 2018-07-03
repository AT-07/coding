package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class that executes the Unit Tests of the SortInnerContent class.
 */
public class TestSortInnerContent {

    private SortInnerContent sort;

    /**
     * Method that initializes my method my sort object.
     */
    @Before
    public void inicialization() {
        sort = new SortInnerContent();
    }

    /**
     * Method that verifies the correctness of my ordering method.
     */
    @Test
    public void sortInnerContentTestCorrect() {
        final String actualValue = "Las matematicas son divertidas";
        final String expectedResult = "Las mttmiecaaas son dvtriiedas";
        assertEquals(expectedResult, sort.sortInnerContent(actualValue));
    }

    /**
     * Method that verifies the correctness of my ordering method.
     */
    @Test
    public void sortInnerContentTest2Correct() {
        final String actualValue = "Las musica es el remedio";
        final String expectedResult = "Las musica es el rmieedo";
        assertEquals(expectedResult, sort.sortInnerContent(actualValue));
    }

    /**
     * Method that verifies the correctness of my ordering method.
     */
    @Test
    public void sortInnerContentTest3Correct() {
        final String actualValue = "Coding is very funny";
        final String expectedResult = "Conidg is vrey funny";
        assertEquals(expectedResult, sort.sortInnerContent(actualValue));
    }

    /**
     * Method that verifies the correctness of my ordering method with an erroneous expected result.
     */
    @Test
    public void sortInnerContentTestIncorrect() {
        final String actualValue = "Inglaterra esta ganando";
        final String expectedResultIncorrect = "Inglaterra esta ganando";
        assertNotEquals(expectedResultIncorrect, sort.sortInnerContent(actualValue));
    }
}
