package org.fundacionjala.coding.cesar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author admin-hp
 */
public class EanTest {
    private Ean ean;

    /**
     * Initialitation from Before.
     */
    @Before
    public void before() {
        ean = new Ean();
    }

    /**
     * String True.
     */
    @Test
    public void testValidarVerdadero() {
        final String entrada = "4003301018398";
        Assert.assertTrue(ean.validar(entrada));
    }

    /**
     * String False.
     */
    @Test
    public void testValidarFalse() {
        final String entrada = "4003301018392";
        Assert.assertFalse(ean.validar(entrada));
    }

    /**
     * Strinf sum is cero.
     */
    @Test
    public void testValidarCero() {
        final String entrada = "0149600000000";
        Assert.assertTrue(ean.validar(entrada));
    }
}
