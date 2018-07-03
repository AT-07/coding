package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;


/**
 * test of Twisted of array integer.
 */

public class TwistedTest {


    private Twisted sw;

    /**
     * it is firth method to execute.
     */
    @Before
    public void before() {
        sw = new Twisted();
    }


    /**
     * test twisted pass of array integer.
     */
    @Test
    public void twistedTestPass() {


        final int[] actualResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] expectedResult2 = {1, 2, 7, 4, 5, 6, 3, 8, 9};

        assertArrayEquals(expectedResult2, sw.twisted(actualResult));
    }

    /**
     * test twisted failed of array integer.
     */
    @Test
    public void twistedTestFailed() {


        final int[] actualResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] expectedResult2 = {1, 2, 7, 4, 5, 6, 7, 8, 9};
        assertFalse(expectedResult2.equals(sw.twisted(actualResult)));
    }

}
