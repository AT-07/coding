package org.fundacionjala.coding.erikvargas;

/**
 * This method is responsible for validating in ean code.
 * @author ErikVargas.
 * @return boolean.
 */
public class EanValidator {
    private static final int MULTIPLICADOR_PAR = 3;
    private static final int MULTIPLICADOR_IMPAR = 1;
    private static final int DIVISOR = 10;

    /**
     * this metodo valida el codigo ean.
     * @param eanCode this is param set string.
     * @return true or false
     */
    public boolean validate(String eanCode) {

        int valor = 0, valor1 = 0;
        for (int i = 0; i < eanCode.length(); i++) {
            int intEan = Character.getNumericValue((eanCode.charAt(i)));
            if (i % 2 != 0) {
                valor += intEan * MULTIPLICADOR_PAR;
            } else {
                valor1 += intEan * MULTIPLICADOR_IMPAR;
            }
        }
        return (valor + valor1) % DIVISOR == 0;
    }
}
