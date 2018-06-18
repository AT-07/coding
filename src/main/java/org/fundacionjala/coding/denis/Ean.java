package org.fundacionjala.coding.denis;

public class Ean {
    private int[] digitos;

    public boolean kata() {
        return digitos.length == 13 ? isEan() : false;
    }

    public boolean isEan() {
        int sum = 0;
        for (int i = 1; i < digitos.length; i++) {
            sum += i % 2 == 0 ? digitos[i - 1] * 3 : digitos[i - 1] * 1;
        }
        System.out.println(sum);
        int ckekout = sum % 10 == 0 ? 0 : 10 - sum % 10;
        return ckekout == digitos[digitos.length - 1];
    }

    public int[] getDigitos() {
        return digitos;
    }

    public void setDigitos(int[] digitos) {
        this.digitos = digitos;
    }

}

