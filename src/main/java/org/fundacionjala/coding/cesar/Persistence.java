package org.fundacionjala.coding.cesar;
/**
 *
 * @author admin-hp
 */
public class Persistence {
    /**
     *
     * @param num numero que se ingresara para ver la persistencia.
     * @return retorna el cual fue la persistencia del numero.
     */
    public int persistance(int num) {
        String strnum = Integer.toString(num);
        int cont = 0;
            while (strnum.length() > 1) {
                int aux = 1;
                String[] aux2 = strnum.split("");
                for (String i : aux2) {
                    int aux3 = Integer.parseInt(i);
                    aux = aux * aux3;
                }
                strnum = Integer.toString(aux);
                cont = cont + 1;
            }
        return cont;
    }
}
