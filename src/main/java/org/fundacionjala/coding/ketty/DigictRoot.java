package org.fundacionjala.coding.ketty;

/**
 * class digict of number if is number root.
 */
class DigictRoot {

    /**
     * this is method check if a digit root.
     *
     * @param actualNumbers add .
     * @return plus of digict.
     */
    public int digitRoot(int actualNumbers) {
        final int numberDiv = 10;
        final int limitNumber = 9;

        int numberModule;
        int plus = 0;
        while (actualNumbers > 0) {
            numberModule = actualNumbers % numberDiv;
            plus += numberModule;
            actualNumbers = actualNumbers / numberDiv;
            if (actualNumbers == 0 && plus > limitNumber) {
                actualNumbers = plus;
                plus = 0;
            }
        }

        return plus;
    }

}
