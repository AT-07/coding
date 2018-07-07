package org.fundacionjala.coding.daniel;

/**
 * Tests the life of an evaporator containing a gas.
 * <p>
 * We know the content of the evaporator (content in ml), the percentage of foam or gas.
 * lost every day (evap_per_day) and the threshold (threshold) in percentage beyond which.
 * the evaporator is no longer useful. All numbers are strictly positive.
 * <p>
 * The program reports the nth day (as an integer).
 * on which the evaporator will be out of use.
 */
public class DeodorantEvaporator {

    /**
     * Method that will return the days of life of use of the deodorant using the rule of 3.
     *
     * @param contenido  amount or quantity that has the deodorante.
     * @param gasPerdido gas lost day to day.
     * @param umbral     interval which should not be passed the content of our deodorant.
     * @return time of live od deodorant in days.
     */
    public int deodorantEvaporator(double contenido, double gasPerdido, double umbral) {
        int dia = 0;
        final int porsentaje = 100;
        while (umbral < contenido) {
            contenido = contenido - ((contenido * gasPerdido) / porsentaje);
            dia++;
        }
        return dia;
    }
}
