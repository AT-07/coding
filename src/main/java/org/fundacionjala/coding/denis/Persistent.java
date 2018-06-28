package org.fundacionjala.coding.denis;

/**
 * This is the class principal.
 */
public class Persistent {
    private static final int NUMCHECK = 9;

    /**
     * @param data is data value for at work.
     * @return the amount the repeat the operation.
     */
    public int persistent(long data) {
        return data < NUMCHECK ? 0 : check(data);
    }

    /**
     * @param data verify the amount operation.
     * @return amount operation.
     */
    public int check(long data) {
        final int dataDiv = 10;
        int actualResult = 0;
        int producto = 1;
        while (data > NUMCHECK) {
            while (data != 0) {
                producto *= data % dataDiv;
                data /= dataDiv;
            }
            data = producto;
            producto = 1;
            actualResult++;

        }
        return actualResult;

    }
}
