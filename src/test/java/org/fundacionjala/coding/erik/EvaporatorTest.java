package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * this class test.
 */
public class EvaporatorTest {
    private Evaporator test;
    public static final int EXPECTED = 22;
    public static final int EVAP_PER_DAY = 10;
    public static final int THRESHOLD = 10;
    /**
    * before ini.
    */
    @Before
    public void before() {
        test = new Evaporator();
    }
    /**
     * this test evaporator.
     */
    @Test
    public void testEvaporatorOne() {
        assertEquals(EXPECTED, test.evaporator(EVAP_PER_DAY, THRESHOLD));
    }
}
