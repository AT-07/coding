package org.fundacionjala.coding.testspinwords;

import org.fundacionjala.coding.spinwords.SpinWords;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Clase donde se ejecutaran todos los test de la clase SpinWords.
 */
public class TestSpinWords {

    private SpinWords spinWord;

    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void test() {
        spinWord = new SpinWords();
    }

    /**
     * Test para validar mi test True.
     */
    @Test
    public void spinWordsTestTrue() {
        String cadena = "La principal mision de cada uno es aprender cada dia mas";
        String cadenaModificada = spinWord.spinWords(cadena);
        assertTrue(cadenaModificada.equalsIgnoreCase(spinWord.spinWords(cadena)));

    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void spinWordsTestFalse() {
        String cadena = "La principal mision de cada uno es aprender cada dia mas";
        assertFalse(cadena.equalsIgnoreCase(spinWord.spinWords(cadena)));
    }
}
