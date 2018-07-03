package org.fundacionjala.coding.william;

import java.util.StringJoiner;

public class CamelCase {
    
    public String camelCase(final String word){
        String [] array = word.split(" ");
        StringJoiner result = new StringJoiner("");
        String [] auxiliary;
        for (int i = 0; i<array.length; i++) {
            auxiliary = array [i].split("");
            auxiliary [0] = auxiliary[0].toUpperCase();
            result.add(String.join("", auxiliary));
        }
        return result.toString();
    }
}
