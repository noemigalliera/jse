package com.example.jse.m02.s12;

public class For2 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(i);
			if (i == 2) {
				System.out.println();
				continue;
			} else if (i == 3) {
				System.out.println();
				continue;
			} else if (i == 4) {
				System.out.println();
				continue;
			}
			System.out.println(" " + args[i]);
		}
		System.out.println("Ho finito");
	}
}
