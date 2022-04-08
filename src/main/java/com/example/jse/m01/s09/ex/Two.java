package com.example.jse.m01.s09.ex;

import java.util.Arrays;

public class Two {
	public static void main(String[] args) {
		// Array bidimensionale
		String[][] two = { { "ciao", "buongiorno" }, { "hello", "good morning" } };

		System.out.print("First subelement in the second element is: ");
		System.out.println(two[1][0]);

		// TODO:
		// (1) Convert the full array in a string and print it
		String s = Arrays.deepToString(two);
		System.out.println(s);
		// Secondo modo per convertire array bidimensionale in stringa
		System.out.println(Arrays.toString(two[0]) + Arrays.toString(two[1]));
		
		// (2) Convert just the Italian greetings in a string and print it
		String s2 = Arrays.toString(two[0]);
		System.out.println(s2);
		
	}
}

