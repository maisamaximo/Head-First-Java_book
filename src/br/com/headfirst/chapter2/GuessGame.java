package br.com.headfirst.chapter2;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 1 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number;
            System.out.println("Player one guessed " + guess1);

            guess2 = p2.number;
            System.out.println("Player two guessed " + guess2);

            guess3 = p3.number;
            System.out.println("Player three guessed " + guess3);

            if (guess1 == targetNumber) {
                p1IsRight = true;
            }
            if (guess2 == targetNumber) {
                p2IsRight = true;
            }
            if (guess3 == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}