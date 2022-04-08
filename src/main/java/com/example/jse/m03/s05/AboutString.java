package com.example.jse.m03.s05;

public class AboutString {

    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        //sottrazione: numero negativo o positivo
        System.out.println("s < t: " + s.compareTo(t)); 
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); //slicing

        System.out.println("u equals u2? " + u.equals(u2)); //contenuto
        System.out.println("u == u2? " + (u == u2)); //reference

        //ritorna primo indice della lettera passata
        System.out.println("First index of 'l' is s: " + s.indexOf('l')); 
        //ritona ultimo indice della lettera passat
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        //La lettera "x" non è presente nella stringa
        //Non gestisco con le eccezioni, ma ritorna -1 per segnalare "x" non c'è
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        //Indice di una substring
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());
        // String x = "";
        // x.isEmpty();

        System.out.println("s length: " + s.length());

        //rimpiazza tutte le "l" con "q"
        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

//        String[] splits = "one for me, one for you".split(" ");
        String csv = "alpha,beta,gamma,delta";
        String[] splits = csv.split(",");
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        
        //metodo join è statico(classe accanto a join).
        String joined = String.join(" ", splits);
//        String joined = String.join(",", "a", "b", "c");
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase(); //maiuscola
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "Shut UP!".toLowerCase()); //minuscola

        //Si eliminano gli spazi bianchi estremi
        System.out.println("trim [" + " la la la ".trim() + "]");

        int a = 42;
        String b = "hello";
        double c = 10 / 3.0;
        //format è un metodo statico. Serve per formattare le stringhe e decidere il numero di cifre decimali.
        System.out.println(String.format("An integer %d, a string %s, and a floating point %.3f", a, b, c));
        System.out.println("An integer " + a + ", a string " + b + ", and a floating point " + c);

        //valueOf serve per stampare oggetti(anche null).
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
    }
}
