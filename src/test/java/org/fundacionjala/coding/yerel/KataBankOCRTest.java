package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * test case for KataBanck.
 */
public class KataBankOCRTest {
    private KataBankOCR kataBankOCR;

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
        List<StringBuilder> listNumber = new ArrayList<>();
        String numberZero = " _ | ||_|";
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        assertEquals("000000000", kataBankOCR.convertNumber(listNumber));
    }

    /**
     * test validate a digit is no read.
     */
    @Test
    public void convertNumberTwo() {
        List<StringBuilder> listNumber = new ArrayList<>();
        String unknown = " _ |_| _ ";
        String numberZero = " _ | ||_|";
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(numberZero));
        listNumber.add(new StringBuilder(unknown));
        assertEquals("00000000?", kataBankOCR.convertNumber(listNumber));
    }

    /**
     *
     */
    @Test
    public void checksumValidation() {
        assertEquals("664371495 ERR", kataBankOCR.checksumValidation("664371495"));
    }

    /**
     * test case validate checksum 86110??36.
     */
    @Test
    public void checksumValidationTwo() {
        assertEquals("86110??36 ILL", kataBankOCR.checksumValidation("86110??36"));
    }

    /**
     * test case validate checksum 457508000.
     */
    @Test
    public void checksumValidationThree() {
        assertEquals("457508000", kataBankOCR.checksumValidation("457508000"));
    }
}
