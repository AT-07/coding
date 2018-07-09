package org.fundacionjala.coding.yerel;

        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

/**
 * test for program evaporator.
 */
public class EvaporatorTest {

    private Evaporator evaporate;

    /**
     * inizilazed evaporator class.
     */
    @Before
    public void setUp() {
        evaporate = new Evaporator();
    }

    /**
     * test for evaporator method.
     */
    @Test
    public void evaporator() {
        final int expetedDay = 22;
        final double inputMethod = 10;
        assertEquals(expetedDay, evaporate.evaporator(inputMethod, inputMethod, inputMethod));
    }
}
