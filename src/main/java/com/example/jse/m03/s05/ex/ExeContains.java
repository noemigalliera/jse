package com.example.jse.m03.s05.ex;

public class ExeContains {
	static boolean contains(String s, String t) {
//		for(int i =0; i<s.length(); i++) {
//			for(int j=0; j<t.length();j++) {
//				if (s.charAt(i)== t.charAt(j)) {
//					return true;
//				}
//			}
		return false;
//		}

	}

	public static void main(String[] args) {
		boolean result = contains("Hello", "lo");
		System.out.println(result);
	}

}
