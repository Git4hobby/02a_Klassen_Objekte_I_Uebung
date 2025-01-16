package com.cc.java;
public class App {
    
    public static void main(String[] args) {
        /*
         * Instanzierung --> 
         * Erzeugen eines/mehrer Objekte durch Aufrufen eines Konstruktors
         * Objekt <---> Instanz
         * cat --> Referenzvariable
         * cat --> Refernztyp(Klasse)
         * 
         */
    
        Cat cat = new Cat();
        output("Blick von aussen: " + cat); // IMPLIZITE Typumwandlung Cat --> String
        
        output("---------------");
        
        Cat cat2 = new Cat();
        output("Blick von ausen: " + cat2);
        
    }
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
}