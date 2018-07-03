package org.fundacionjala.coding.daniel;

/**
 * write a function that takes two inputs: a string and a character.
 * The function will count the number of times that character appears.
 * in the string. The count is case insensitive.
 */
public class ContarCaracteres {

    /**
     * Method that counts how many times a character in a chain is repeated.
     *
     * @param cadena   string in which you compare.
     * @param caracter character that will compare.
     * @return a integer.
     */
    public int contarCaracter(String cadena, char caracter) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                count++;
            }
        }
        return count;
    }
}
