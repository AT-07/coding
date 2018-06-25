package org.fundacionjala.coding.denis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 * @author Denis
 *
 */
/**
 * unit test for the class TestSpinWords.
 */

public class TestKata {
    private Kata words;
    private String value;
    private String res;
    private String value1;
    private String res1;
    private String valueFail;
    private String resFail;

    /**
     * Init of variables.
     */
    @Before
    public void before() {
        words = new Kata();
        value = "sort the inner content in descending order";
        res = "srot the inner ctonnet in dsnnieedcg oredr";
        value1 = "wait for me";
        res1 = "wiat for me";
        valueFail = "this kata is easy";
        resFail = "this ktaa is esay";
    }

    /**
     * test for validation of testSpinWordsSpinWordsPass.
     */

    @Test
    public void testKataSortTheInnerContentPass() {
        assertEquals(res, words.sortTheInnerContent(value));
        assertEquals(res1, words.sortTheInnerContent(value1));
    }

    /**
     * test for validation of testSpinWordsSpinWordsFails.
     */

    @Test
    public void testKataSortTheInnerContentFail() {
        assertNotEquals(resFail, false, words.sortTheInnerContent(valueFail));

    }

}
