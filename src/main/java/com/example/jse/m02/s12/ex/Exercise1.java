package com.example.jse.m02.s12.ex;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO: print all values in [0 .. 9]
		// (1) for loop
		System.out.println("Start for loop");
		final int BEGIN = 0;
		final int END = 10;
		System.out.println("Print all number from " + BEGIN + " to " + (END - 1));
		for (int i = BEGIN; i < END; i++) {
			System.out.println(i);
		}

		// (2) while loop
		System.out.println("");
		System.out.println("Start while loop");
		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j += 1;
		}

		// (3) do-while loop
		System.out.println("");
		System.out.println("Start do-while loop");
		int z = 0; // j=0;

		do {
			System.out.println(z);
			z += 1;

		} while (z < 10);
	}
}
