package com.example.jse.m02.s12;

public class For3 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(i);
			
			if (i == 2 || i == 3 || i == 4) {
				System.out.println();
				continue;
				}
			
			System.out.println(" " + args[i]);
			}
		}
}
