package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * test case for KataBanck.
 */
public class KataBankOCRTest {
    private KataBankOCR kataBankOCR;
    private static final String ACCOUNT = "457508000";

    /**
     * instance of class KataBankORC.
     */
    @Before
    public void setUp() {
        kataBankOCR = new KataBankOCR();
    }

    /**
     * verificate if a number 000000000.
     */
    @Test
    public void accountNumber() {
        String number = " _  _  _  _  _  _  _  _  _ \n"
                + "| || || || || || || || || |\n"
                + "|_||_||_||_||_||_||_||_||_|\n";
        assertEquals("000000000", kataBankOCR.accountNumber(number));
    }

    /**
     * test case for validate 333333333.
     */
    @Test
    public void accountNumberTwo() {
        String number = " _  _  _  _  _  _  _  _  _ \n"
                + " _| _| _| _| _| _| _| _| _|\n"
                + " _| _| _| _| _| _| _| _| _|\n";
        assertEquals("333333333", kataBankOCR.accountNumber(number));
    }

    /**
     * test case for validate 123456789.
     */
    @Test
    public void accountNumberThree() {
        String number = "    _  _     _  _  _  _  _ \n"
                + "  | _| _||_||_ |_   ||_||_|\n"
                + "  ||_  _|  | _||_|  ||_| _|\n";
        assertEquals("123456789", kataBankOCR.accountNumber(number));
    }

    /**
     * test case for validate number 000000000.
     */
    @Test
    public void convertNumber() {
        String number = "    _  _     _  _  _  _  _ \n"
                + "  | _| _||_||_ |_   ||_||_|\n"
                + "  ||_  _|  | _||_|  ||_| _ \n";

        assertEquals("12345678?", kataBankOCR.accountNumber(number));
    }

    /**
     * test case validate checksum 664371495.
     */
    @Test
    public void checksumValidate() {
        assertFalse(kataBankOCR.checksumValidate("664371495"));
    }

    /**
     * test case validate checksum 86110??36.
     */
    @Test
    public void checksumValidateTwo() {
        assertTrue(kataBankOCR.checksumValidate(ACCOUNT));
    }

    /**
     * test case validate checksum 457508000.
     */
    @Test
    public void seeResultOne() {
        assertEquals(ACCOUNT, kataBankOCR.seeResult(ACCOUNT));
    }

    /**
     * test case validate checksum 86110??36.
     */
    @Test
    public void seeResultTwo() {
        assertEquals("86110??36 ILL", kataBankOCR.seeResult("86110??36"));
    }

    /**
     * test case validate checksum 86110??36.
     */
    @Test
    public void seeResultThree() {
        assertEquals("664371495 ERR", kataBankOCR.seeResult("664371495"));
    }
}
