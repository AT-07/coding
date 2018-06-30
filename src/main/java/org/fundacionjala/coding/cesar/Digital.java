package org.fundacionjala.coding.cesar;
/**
 *
 * @author admin-hp
 */
public class Digital {
    private static final int NUMBER_TEN = 10;
    /**
     *
     * @param num numero que entra al metodo .
     * @return retorna el valor el ultimo digito.
     */
    public int root(int num) {
        int res = 0;
        while (num > 0) {
            res += num % NUMBER_TEN;
            num /=  NUMBER_TEN;
        }
        return res < NUMBER_TEN ? res : root(res);
    }
}

