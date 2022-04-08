package com.example.jse.m03.s05.ex;

public class ExeIndex {
	static int indexOf (String s, char c) {
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i)== c) {
				return i;
			}
		}
		return -1;
			}


	public static void main(String[] args) {
		int result = indexOf("Hello", 'l');
		System.out.println(result);
	}
}
