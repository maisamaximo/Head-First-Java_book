package br.com.headfirst.chapter1;

public class BeerSong {
    public static void main(String[] args) {
        int beer = 99;
        String word = "bottles";

        while (beer > 0) {
            if (beer == 1) {
                word = "bottle";
            }
            System.out.println(beer + " " + word + " of beer on the wall");
            System.out.println(beer + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beer = beer - 1;
        }

        if (beer <   0) {
            System.out.println(beer + " " + word + " of beer on the wall");
        } else {
            System.out.println("No more bootles of beer on the wall...");
        }
    }
}
