package org.fundacionjala.coding.cesar;

public class Evaporator {

    private static final int CIEN = 100;

    /**
     * @param contenido  from evaporator.
     * @param porcentaje The percentage of foam or gas lost every day.
     * @param umbral     % more.
     * @return Day return.
     */

    public int evaporador(double contenido, final double porcentaje, final double umbral) {
        int cont = 0;
        double minContenido = (umbral / CIEN) * contenido;
        while (contenido > minContenido) {
            double perdidaDia = (porcentaje / CIEN) * contenido;
            contenido = contenido - perdidaDia;
            cont++;

        }
        return cont;

    }
}
