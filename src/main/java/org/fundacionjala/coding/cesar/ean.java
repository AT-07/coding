package org.fundacionjala.coding.cesar;

public class ean {
    private String digitos = "";
    private String cadena = "";
    private int numComprobacion = 0;

    public ean() {
        this.setCadena("0000000000000");
    }

    public ean(String cadena1) {
        this.setCadena(cadena1);
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
        digitos = cadena.substring(0, cadena.length() - 1);
        numComprobacion = Integer.valueOf(cadena.substring(cadena.length() - 1));
    }

    public boolean validar() {

        String[] aux = digitos.split("");
        int suma = 0;
        for (String i : aux) {
            int num = Integer.valueOf(i);
            if (num % 2 == 0) {
                num = num * 1;
            } else {
                num = num * 3;
            }
            suma = suma + num;
        }
        int numcom = 10 - (suma % 10);
        boolean res;
        if (numcom == numComprobacion) {
            res = true;
            System.out.println("ES VALIDO");
        } else {
            res = false;
            System.out.println("ES INVALIDO");
        }
        return res;
    }
}
