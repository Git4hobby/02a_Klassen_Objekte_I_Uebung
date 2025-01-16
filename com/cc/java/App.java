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
        // IMPLIZITE Typumwandlung Cat --> String
        output("Blick von aussen: " + cat);
        cat.getInstanceVariable();

        output("---------------");
        
        Cat cat2 = new Cat();
        output("Blick von ausen: " + cat2);
        cat2.getInstanceVariable();
    }
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
}