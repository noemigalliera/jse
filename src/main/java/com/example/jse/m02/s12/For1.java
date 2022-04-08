package com.example.jse.m02.s12;

public class For1 {
	public static void main(String[] args) {
		System.out.println("Passami degli argomenti");
		for (int i=0;i<args.length; i++) {
			System.out.print(i);
			if (i==2) {
				System.out.println();
				i += 2; //i = 4
				continue;
			}
			
			System.out.println(" " + args[i]);
		}
		System.out.println("Ho finito");
				
			
	}

}
