package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Clase que hace correr las pruebas de la clase Ean.
 */
public class TestCamelCase {

    private CamelCase camel;

    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void test() {
        camel = new CamelCase();
    }

    /**
     * Test para validar mi test True.
     */
    @Test
    public void camelCaseTestCorrect() {
        final String actualValue = "Hola como estan";
        final String expectedResult = "HolaComoEstan";
        assertEquals(expectedResult, camel.camelCase(actualValue));
    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void camelCaseTest2Correct() {
        final String actualValue = "Coding is funny";
        final String expectedResult = "CodingIsFunny";
        assertEquals(expectedResult, camel.camelCase(actualValue));
    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void camelCaseTest3Correct() {
        final String actualValue = "Gladys da mucha tarea";
        final String expectedResult = "GladysDaMuchaTarea";
        assertEquals(expectedResult, camel.camelCase(actualValue));
    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void camelCaseTestIncorrect() {
        final String actualValue = "La musica";
        final String expectedResultIncorrect = "La musica";
        assertNotEquals(expectedResultIncorrect, camel.camelCase(actualValue));
    }
}
