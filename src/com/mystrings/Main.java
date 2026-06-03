/**
 *  Java program to demonstrate String class.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an initialized string instance.
        String str = "I am a string";

        //  Checking ifstring has character 't'.
        boolean hasT = str.contains("t");

        // Printing boolean value of hasT.
        System.out.println(hasT); // Output: true

        // Finding index of character 'a'.
        int index = str.indexOf("a");

        // Printing value of index.
        System.out.println(index); // Output: 2

        // Finding index of next character 'a'.
        int index1 = str.indexOf("a", 3);

        // Printing value of index1.
        System.out.println(index1); // Output: 5

    }
}
