package com.example.jse.m03.s08;

//Trova il valore più piccolo in un array
public class ExMinor {
	static int min(int[] input) {
		//inserisco nel buffer il valore da cui partire
		int buffer = input[0]; 
		for (int i = 1; i < input.length; i++) {

			//indice dell'array è minore dell'indice in posizione 1?
			if (input[i] < buffer) {
				buffer = input[i]; 
			}
//			else {
//				continue;
//			}
		}
		return buffer; 
	}

	public static void main(String[] args) {
		int[] array = { 10, 2, 4, 1, 9 };
		int x = min(array);
		System.out.println(x);
	}

}
