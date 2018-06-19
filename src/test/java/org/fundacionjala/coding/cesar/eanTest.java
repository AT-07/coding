package org.fundacionjala.coding.cesar;
import org.junit.Before;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class eanTest {
    ean val;

    @Before
    public void before(){
        val = new ean();
        System.out.println("before");
    }
    @Test
    public void testValidarPass(){
        System.out.println("pasa");
        boolean res;
        val.setCadena("4003301018398");
        res=val.validar();
        assertEquals(true,res);
    }
    @Test
    public void testValidarFailed(){
        System.out.println("no pasa");
        boolean res;
        val.setCadena("4003301018392");
        res=val.validar();
        assertEquals(false,res);
    }
}
