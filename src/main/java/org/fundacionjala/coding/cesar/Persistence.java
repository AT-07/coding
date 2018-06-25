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
        final int numero = 10;
        int cont = 0;
            while (num > numero) {
                int aux = 1;
                for (String number : Integer.toString(num).split("")) {
                    aux *= Integer.parseInt(number);
                }
                num = aux;
                cont++;
            }
        return cont;
    }
}
