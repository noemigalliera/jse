package com.example.jse.m02.s04;

public class Concatenation {
    public static void main(String[] args) {
        // add
        System.out.print("5 + 7: ");
        System.out.println(5 + 7); // 12

        // cast to string and concatenate
        System.out.print("5 + \"7\": "); //backslash permette di inseirire il doppio apice nella stringa
        System.out.println(5 + "7"); // 57 //concatena il 5 con il 7

        // add, cast to string and concatenate
        System.out.print("5 + 7 + \"4\": ");
        System.out.println(5 + 7 + "4"); // -> 124 \\somma i primi due e concatena il 4 stringa

        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        // "multiply" a string
        System.out.print("Repeat \"Vogons\" three times: ");
        System.out.println("Vogons".repeat(3)); // Java 11

        String s = "Hello";
        // both t and s refer to the same object
        String t = s;  

        // reference to a different object created by concatenation
        s += 3; //variabile è stata sovrascritta

        System.out.print("+= on a string generate a new object: ");
        System.out.println(s); 

        System.out.print("We could still have access to the original string: ");
        System.out.println(t);
    }
}
