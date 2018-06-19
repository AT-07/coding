package org.fundacionjala.coding.cesar;
/**
 *
 * @author admin-hp
 */
public class Ean {
    private String digitos = "";
    private int numComprobacion = 0;
    private static final int MPLT_IMPAR = 3;
    private static final int MPLT_PAR = 1;
    private static final int MPLT_MOD = 10;

    /**
     * Constructor without parameters.
     */
    public Ean() {
        this.setCadena("0000000000000");
    }

    /**
     * @param cadena1 Constructor with parameters.
     */
    public Ean(String cadena1) {
        this.setCadena(cadena1);
    }

    /**
     *
     * @param cadena New chain value
     */

    public void setCadena(String cadena) {
        digitos = cadena.substring(0, cadena.length() - 1);
        numComprobacion = Integer.parseInt(cadena.substring(cadena.length() - 1));
    }

    /**
     *
     * @return Returning false or true value
     */

    public boolean validar() {

        String[] aux = digitos.split("");
        int suma = 0;
        for (String i : aux) {
            int num = Integer.parseInt(i);
            if (num % 2 == 0) {
                num = num * MPLT_PAR;
            } else {
                num = num * MPLT_IMPAR;
            }
            suma = suma + num;
        }
        int numcom = MPLT_MOD - (suma % MPLT_MOD);
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
