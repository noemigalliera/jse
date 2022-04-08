package com.example.jse.m02.s12;

public class For4 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(i);

			if (i > 1 && i < 5) {
				System.out.println("Sto skippando!");
				continue;
			}

			System.out.println(" " + args[i]);
		}
		System.out.println("Ho finito");
	}

}
