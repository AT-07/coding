package org.fundacionjala.coding.cesar;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author admin-hp
 */
public class EanTest {
    private Ean val;

    /**
     * Starting the before annotation.
     */
    @Before
    public void before() {
        val = new Ean();
    }

    /**
     * test for Validar pass.
     */
    @Test
    public void testValidarPass() {
        boolean res;
        val.setCadena("4003301018398");
        res = val.validar();
        assertEquals(true, res);
    }

    /**
     * test for Validar failed.
     */
    @Test
    public void testValidarFailed() {
        boolean res;
        val.setCadena("4003301018392");
        res = val.validar();
        assertEquals(false, res);
    }
}
