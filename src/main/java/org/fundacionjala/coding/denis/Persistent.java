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
    public int persistent(int data) {
        final int dataDiv = 10;
        int actualResult = 0;
        while (data > NUMCHECK) {
            int producto = 1;
            while (data != 0) {
                producto *= data % dataDiv;
                data /= dataDiv;
            }
            data = producto;
            actualResult++;

        }
        return actualResult;
    }
}
