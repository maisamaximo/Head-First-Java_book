package br.com.headfirst.chapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] list1 = {"Shofued", "Mosey", "Malkurion", "Nerothur", "Xaebu", "Goadan"};
        String[] list2 = {"Koeziacle", "Biobei", "Drualda", "Viufe", "Garneurn", "Gorggog"};
        String[] list3 = {"Veton", "Amgiewu", "Xezyael", "Coyur", "Tordoxe", "Riepi"};

        int oneLength = list1.length;
        int twoLength = list2.length;
        int threeLength = list3.length;

        int random1 = (int) Math.random() * oneLength;
        int random2 = (int) Math.random() * twoLength;
        int random3 = (int) Math.random() * threeLength;

        String phrase = list1[random1] + " " + list2[random2] + " " + list3[random3];

        System.out.println("Random phrase: " + phrase);
    }
}
