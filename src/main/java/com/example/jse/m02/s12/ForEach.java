package com.example.jse.m02.s12;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three", "four", "five" };
        // ...

        // for-each helps readability
        for (String number : numbers) {
            System.out.println(number);
        }

        // we really don't care about "i" here
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // il foreach non lavora bene con i primitivi.
        //se devo fare il print non ci sono problemi
        //se devo fare delle operazioni (es: incremento di 1)
        //il foreach lavora su una copia(reference) senza modificare il primitivo
        //lo stesso problema sussiste con le stringhe immutabili.
        // beware of how for-each works on primitives
        int[] ai = { 1, 2, 3, 4, 5 };
        for (int cur : ai) {
            cur += 1;
            System.out.println(cur);
        }
        System.out.println(Arrays.toString(ai));

        // beware of how for-each works on immutable references
        for (String number : numbers) {
            number += 3;
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numbers));

        // classic for is what we need in this case
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += i;
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
