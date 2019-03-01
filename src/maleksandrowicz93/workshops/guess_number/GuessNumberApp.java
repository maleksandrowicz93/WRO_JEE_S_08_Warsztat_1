package maleksandrowicz93.workshops.guess_number;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) {

        Random r = new Random();
        int numberToGuess = r.nextInt(100)+1;
        lookigForNumberByUser(numberToGuess);

    }

    static void lookigForNumberByUser (int numberToGuess) {

        Scanner scanner = new Scanner(System.in);
        int checkedNumber = 0;
        int howManyTimes = 0;
        System.out.print("Let's play the game. Try to find a random number. Write value You want to check: ");
        while (checkedNumber != numberToGuess) {
            checkedNumber = scanner.nextInt();
            if (checkedNumber > numberToGuess) {
                System.out.print("Za dużo! Spróbuj jeszcze raz: ");
            } else if (checkedNumber < numberToGuess) {
                System.out.print("Za mało! Spróbuj jeszcze raz: ");
            }
            howManyTimes++;
        }

        System.out.println("You managed to guess a random number. You needed " + howManyTimes + " attempts.");

    }

}
