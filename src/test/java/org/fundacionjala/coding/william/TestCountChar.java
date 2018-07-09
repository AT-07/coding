package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * Class TestCountChar.
 */
public class TestCountChar {

    private CountChar count;

    /**
     * Method that initializes my count object.
     */
    @Before
    public void inicialization() {
        count = new CountChar();
    }

    /**
     * Method that verifies the correctness of my countChar method.
     */
    @Test
    public void countCharTest1Correct() {
        final String actualValue = "Hola como estan";
        final char caracter = 'o';
        final int expectedResult = 3;
        assertEquals(expectedResult, count.countChar(actualValue, caracter));
    }

    /**
     * Method that verifies the correctness of my countChar method.
     */
    @Test
    public void countCharTest2Correct() {
        final String actualValue = "Fundacion Jala esta en Cochabamba";
        final char caracter = 'a';
        final int expectedResult = 7;
        assertEquals(expectedResult, count.countChar(actualValue, caracter));
    }

    /**
     * Method that verifies the correctness of my countChar method with expected result erroneo.
     */
    @Test
    public void countCharTestIncorrect() {
        final String actualValue = "Mi computadora esta lenta";
        final char caracter = 't';
        final int expectedResult = 1;
        assertNotEquals(expectedResult, count.countChar(actualValue, caracter));
    }
}
