package org.fundacionjala.coding.ketty;

/**
 * verifica que un string  EAN.
 */
public class Ean {

    /**
     * El  CheckSum  valida si num es "EAN".
     *
     * @param num es la variable  String.
     * @return return un valor boolean true es "EAN" y return false no es "EAN".
     */
    public boolean checkSum(String num) {
        final int numeroMultiplicadorPar = 3;
        int index = 1;
        char numeroChar = ' ';
        int suma = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            numeroChar = num.charAt(i);
            if (index % 2 == 0) {
                suma += Character.getNumericValue(numeroChar) * numeroMultiplicadorPar;
                index++;
            } else {
                suma += Character.getNumericValue(numeroChar) * 1;
                index++;
            }
        }
        System.out.println(suma);
        int x = num.length() - 1;
        char ni = num.charAt(x);
        if (comprovacion(suma) == Character.getNumericValue(ni)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
        //asi?
    }

    /**
     * @param sumaN es la valor de total  uno de sus digitos del un string numero.
     * @return un valor "sumaN " .
     */

    public int comprovacion(int sumaN) {
        final int div = 10;
        if (sumaN % div == 0) {
            sumaN = 0;
        } else {
            sumaN = div - (sumaN % div);
        }
        return sumaN;
    }
}

