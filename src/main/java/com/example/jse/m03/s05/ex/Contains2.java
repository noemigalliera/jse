package com.example.jse.m03.s05.ex;

public class Contains2 {

static boolean contains2 (String s, char c) {
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i)== c) {
				return true;
			}
		}
		return false;
			}


	public static void main(String[] args) {
		boolean result = contains2 ("Hello", 'm');
		System.out.println(result);
	}
}


