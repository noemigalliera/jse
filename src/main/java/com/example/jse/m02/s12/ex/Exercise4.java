package com.example.jse.m02.s12.ex;

import java.util.Arrays;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * TODO: print up to 3 args
		 * 
		 * ["ciao", "hello"] -> "ciao" "hello"
		 * 
		 * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
		 */
		for (int i = 0; i < args.length; i++) {
			if (i<3) {
				System.out.println(args[i]);
			}
           
        }
		
		System.out.println("----");
		int end;
		if (args.length > 3) {
			end = 3;
		} else {
			end = args.length;
		}
		
		for (int i = 0; i < end; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("----");
		int finish = (args.length > 3) ? 3 : args.length;
		for (int i = 0; i< finish; i++) {
			System.out.println(args[i]);
		}
		//if (args.length < 4) {
			//System.out.println(Arrays.toString(args));
		//}
		//else {
			//System.out.println(Arrays.toString(args));	
		}

	}


