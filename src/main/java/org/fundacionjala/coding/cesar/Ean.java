package org.fundacionjala.coding.cesar;
/**
 *
 * @author admin-hp
 */
public class Ean {
    private int numComprobacion = 0;
    private static final int MPLT_IMPAR = 3;
    private static final int MPLT_PAR = 1;
    private static final int MPLT_MOD = 10;

    /**
     *
     * @param cadena Variable to be processed.
     * @return Falso o true process value.
     */
    public boolean validar(final String cadena) {
        int numcom;
        String digitos = cadena.substring(0, cadena.length() - 1);
        numComprobacion = Integer.parseInt(cadena.substring(cadena.length() - 1));
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
        numcom = MPLT_MOD - (suma % MPLT_MOD);
        return numcom == numComprobacion;
    }
}
