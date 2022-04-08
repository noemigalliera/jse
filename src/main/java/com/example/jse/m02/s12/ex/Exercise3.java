package com.example.jse.m02.s12.ex;

public class Exercise3 {
    public static void main(String[] args) {
        
         //TODO: Print 
         //(1) the number of arguments passed to this main
    	System.out.println("Il numero di argomenti è"+ args.length);
         //(2) each argument
    	for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
         
    }
}
