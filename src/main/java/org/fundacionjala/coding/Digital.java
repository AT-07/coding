package org.fundacionjala.coding;

/**
 *
 * @author admin-hp
 */
public class Digital {

    /**
     *
     * @param num numero que entra al metodo .
     * @return retorna el valor el ultimo digito.
     */
    public int root(int num) {
        String strnum = Integer.toString(num);
        int aux4 = 0;
        int aux5 = 0;
        int res;
        while (strnum.length() > 1) {
            int aux = 0;
            String[] aux2 = strnum.split("");
            for (String i : aux2) {
                int aux3 = Integer.parseInt(i);
                aux4 = aux;
                aux5 = aux3;
                aux +=  aux3;

            }
            strnum = Integer.toString(aux);


        }
        res = aux4 + aux5;
        return res;
    }
}

