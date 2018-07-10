package org.fundacionjala.coding.ketty;

/**
 * verifica que un string  EAN.
 */
public class Ean {


    /**
     * El  CheckSum, valida si string numero es "EAN".
     *
     * @param num es la es una cadena numerica.
     * @return un valor boolean,  true si la cadena numerica es "EAN" y false cuando no es "EAN".
     */
    public boolean checkSum(String num) {
        final int numeroImpar = 1;
        final int numeroPar = 3;
        int index = 1;
        char numeroChar = ' ';
        int suma = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            numeroChar = num.charAt(i);
            if (index % 2 == 0) {
                suma += Character.getNumericValue(numeroChar) * numeroPar;
                index++;
            } else {
                suma += Character.getNumericValue(numeroChar) * numeroImpar;
                index++;
            }
        }

        int x = num.length() - 1;
        char ni = num.charAt(x);
        return comprovacion(suma) == Character.getNumericValue(ni);

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

