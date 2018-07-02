package org.fundacionjala.coding.franz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * this is a test of class.
 */
public class BankOCRTest {
    private BankOCR bankNumber;
    private static final String LINE_COMMON = " _  _  _  _  _  _  _  _  _ ";

    /**
     * this is a method before test.
     */
    @Before
    public void ini() {
        bankNumber = new BankOCR();
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void tesyAccountNumbersNine() {
        String lineOne = LINE_COMMON;
        String lineTwo = "|_||_||_||_||_||_||_||_||_|";
        String lineThr = " _| _| _| _| _| _| _| _| _|";
        assertEquals("999999999", bankNumber.accountNumbers(lineOne, lineTwo, lineThr));
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void testAccountNumbersSeven() {
        String lineOne = LINE_COMMON;
        String lineTwo = "  |  |  |  |  |  |  |  |  |";
        String lineThr = "  |  |  |  |  |  |  |  |  |";
        assertEquals("777777777", bankNumber.accountNumbers(lineOne, lineTwo, lineThr));
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void testAccountNumbersEigth() {
        String lineOne = LINE_COMMON;
        String lineTwo = "|_||_||_||_||_||_||_||_||_|";
        String lineThr = "|_||_||_||_||_||_||_||_||_|";
        assertEquals("888888888", bankNumber.accountNumbers(lineOne, lineTwo, lineThr));
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void testAccountNumbersNumbers() {
        String lineOne = "    _  _     _  _  _  _  _ ";
        String lineTwo = "  | _| _||_||_ |_   ||_||_|";
        String lineThre = "  ||_  _|  | _||_|  ||_| _|";
        assertEquals("123456789", bankNumber.accountNumbers(lineOne, lineTwo, lineThre));
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void testAccountNumbersZero() {
        String lineOne = LINE_COMMON;
        String lineTwo = "| || || || || || || || || |";
        String lineThr = "|_||_||_||_||_||_||_||_||_|";
        assertEquals("000000000", bankNumber.accountNumbers(lineOne, lineTwo, lineThr));
    }

    /**
     * this is a test of method accountNumber().
     */
    @Test
    public void testAccountNumbersILL() {
        String lineOne = "    _  _     _  _  _  _  _ ";
        String lineTwo = "  | _| _||_| _ |_   ||_||_|";
        String lineThr = "  ||_  _|  | _||_|  ||_| _ ";
        assertEquals("1234?678?", bankNumber.accountNumbers(lineOne, lineTwo, lineThr));
    }

    /**
     * this is a test of method isValidAccount().
     */
    @Test
    public void testIsValidAccountTrue() {
        assertTrue(bankNumber.isValidAccount("100000029"));
    }

    /**
     * this is a test of method isValidAccount().
     */
    @Test
    public void testIsValidAccountFalse() {
        assertFalse(bankNumber.isValidAccount("123456799"));
    }

    /**
     * this is a test of method showResult().
     */
    @Test
    public void testshowResultCorrect() {
        String actual = "457508000";
        String expected = "457508000";
        assertEquals(expected, bankNumber.showResults(actual));
    }

    /**
     * this is a test of method showResult().
     */
    @Test
    public void testshowResultError() {
        String actual = "664371495";
        String expected = "664371495 ERR";
        assertEquals(expected, bankNumber.showResults(actual));
    }

    /**
     * this is a test of method showResult().
     */
    @Test
    public void testshowResultILL() {
        String actual = "86110??36";
        String expected = "86110??36 ILL";
        assertEquals(expected, bankNumber.showResults(actual));
    }
}
