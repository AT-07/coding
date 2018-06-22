package TestEAN;

import org.fundacionjala.coding.EAN.EAN;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Esta es la clase Test que hace correr las pruebas de la clase EAN.
 */

public class testEan {

    private EAN test;


    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void test() {
        test = new EAN();
    }

    /**
     * Test para validar mi test True.
     */
    @Test
    public void validateEanTestTrue() {
        assertTrue(test.validate("4003301018398"));
    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void validateEanTestFalse() {
        assertFalse(test.validate("4003301018392"));
    }
}
