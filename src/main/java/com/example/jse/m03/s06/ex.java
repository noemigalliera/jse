package com.example.jse.m03.s06;

public class ex {
	static String substring(String s, int start, int end) {
		//Se avessi usato una lo String sarebbe stato comunque modificabile
		//perchè non sto lavorando sulla stringa originale
		//ma lo String è poco efficiente, java usa comunque StringBuilder 
		//o crea tante piccole stringhe, occupando memoria e rallentando il programma.
		StringBuilder sb = new StringBuilder();
		for (int i = start; i < end; i++) {
			sb.append(s.charAt(i));
			
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		String s = substring("Hello", 1, 3);
		System.out.println(s);
	}
}
