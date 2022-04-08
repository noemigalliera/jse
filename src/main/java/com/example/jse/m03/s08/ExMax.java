package com.example.jse.m03.s08;

//Trova l'indice del valore più grande in un array
public class ExMax {
	static int max(int[] input) {
		int buffer = 0;
		for (int i = 1; i < input.length; i++) {

			if (input[i] > input[buffer]) {
				buffer = i; 
			}
		}
		return buffer; //indice
	}

	public static void main(String[] args) {
		int[] array = { 1,7,40,55,2,0 };
		int x = max(array);
		System.out.println(x);
	}


}
