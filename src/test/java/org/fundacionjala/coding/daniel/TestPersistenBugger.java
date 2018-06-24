package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * clase que contiene pruebas para nuestra clase persistentBugger.
 */
public class TestPersistenBugger {
    private PersistentBugger persistent;
    private static final int PRUEBA1 = 999;
    private static final int PRUEBA2 = 4;
    private static final int PRUEBA3 = 9;
    private static final int PRUEBA4 = 3;
    private static final int PRUEBA5 = 39;
    private static final int PRUEBA6 = 912409;
    private static final int PRUEBA7 = 729;
    private static final int PRUEBA8 = 20;



    /**
     * creamos un constructors de nuestra clase.
     */
    @Before
    public void setUp() {
        persistent = new PersistentBugger();
    }

    /**
     * prueba para verificar cuando el parametro de entrada es 3 digitos.
     */
    @Test
    public void testCantidadMultiplicadaTresDigitos() {
        int resultadOptenido = persistent.cantidadMultiplicada(PRUEBA1);
        assertEquals(PRUEBA2, resultadOptenido);
    }

    /**
     * prueba para verificar cuando el parametro de entrada es 1 digito.
     */
    @Test
    public void testCantidadMultiplicadaUnDigito() {
        int resultadOptenido = persistent.cantidadMultiplicada(PRUEBA3);
        assertEquals(0, resultadOptenido);
    }

    /**
     * prueba para verificar cuando el paramentro de entrada es 2 digitos.
     */
    @Test
    public void testCantidadMultiplicadaDosDigitos() {
        int resultadOptenido = persistent.cantidadMultiplicada(PRUEBA5);
        assertEquals(PRUEBA4, resultadOptenido);
    }

    /**
     * prueba para verificar cuando el paramentro tiene un  0.
     */
    @Test
    public void testCantidadMultiplicadaConCero() {
        int resultadOptenido = persistent.cantidadMultiplicada(PRUEBA6);
        assertEquals(1, resultadOptenido);
    }

    /**
     * test que verifica si se multiplican 3 digitos numericos.
     */
    @Test
    public void testMultiplicarNumeroUn() {
        int resultadOptenido = persistent.multiplicarNumero(PRUEBA1);
        assertEquals(PRUEBA7, resultadOptenido);
    }

    /**
     * test que verifica si se multiplica 1 digito numerico.
     */
    @Test
    public void testMultiplicarNumeroDos() {
        int resultadOptenido = persistent.multiplicarNumero(PRUEBA3);
        assertEquals(PRUEBA3, resultadOptenido);
    }

    /**
     * test que verifica si se multiplican 2 digitos numericos cuando hay un digito 0.
     */
    @Test
    public void testMultiplicarNumeroCuatro() {
        int resultadOptenido = persistent.multiplicarNumero(PRUEBA8);
        assertEquals(0, resultadOptenido);
    }

}
