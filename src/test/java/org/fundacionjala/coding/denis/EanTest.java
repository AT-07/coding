package org.fundacionjala.coding.denis;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

class EanTest {
    Ean digitos = new Ean();
    int[] value = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 8};
    int[] value1 = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 2};

    @Test
    void EanKataTrue() {
        digitos.setDigitos(value);
        assertTrue(digitos.kata());
    }

    @Test
    void EanKataFalse() {
        digitos.setDigitos(value1);
        assertFalse(digitos.kata());
    }

    @Test
    void EanSetEanTrue() {
        boolean chekout = false;
        int[] value2 = {1, 2, 0, 3, 3, 0, 1, 0, 1, 4, 3, 5, 3};
        digitos.setDigitos(value2);
        for (int i = 0; i < value2.length; i++) {
            chekout = value2[i] == digitos.getDigitos()[i] ? true : false;
            if (chekout == false) break;
        }
        assertTrue(chekout);
    }

    @Test
    void EanSetEanFalse() {
        boolean chekout = false;
        int[] value2 = {1, 2, 0, 3, 3, 0, 1, 0, 1, 4, 3, 5, 3};
        int[] value3 = {1, 2, 0, 3, 3, 0, 1, 0, 1, 3, 3, 5, 3};
        digitos.setDigitos(value2);
        for (int i = 0; i < value2.length; i++) {
            chekout = value3[i] == digitos.getDigitos()[i] ? true : false;
            if (chekout == false) break;
        }
        assertFalse(chekout);
    }
}
