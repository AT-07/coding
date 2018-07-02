package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Denis
 */

/**
 * unit test for the class TestSpinWords.
 */

public class TestKata {
    private Kata words;

    /**
     * Init of variables.
     */
    @Before
    public void before() {
        words = new Kata();
    }

    /**
     * test for validation of testSpinWordsSpinWordsPass.
     */

    @Test
    public void testKataSortTheInnerContentPass() {
        final String data = "sort the inner content in descending order";
        final String spectetResult = "srot the inner ctonnet in dsnnieedcg oredr";
        final String data1 = "wait for me";
        final String spectetResult1 = "wiat for me";
        assertEquals(spectetResult, words.sortTheInnerContent(data));
        assertEquals(spectetResult1, words.sortTheInnerContent(data1));
    }

    /**
     * test for validation of testSpinWordsSpinWordsFails.
     */

    @Test
    public void testKataSortTheInnerContentFail() {
        final String data = "this kata is easya";
        final String spectetResult = "this ktaa is esaya";
        assertNotEquals(spectetResult, false, words.sortTheInnerContent(data));

    }

}
