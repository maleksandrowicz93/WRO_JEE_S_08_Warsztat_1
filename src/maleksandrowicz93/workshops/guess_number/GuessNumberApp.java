package maleksandrowicz93.workshops.guess_number;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) {

        Random r = new Random();
        int numberToGuess = r.nextInt(100) + 1;
        lookigForNumberByUser(numberToGuess);

    }

    static void lookigForNumberByUser(int numberToGuess) {

        Scanner scanner = new Scanner(System.in);
        int checkedNumber = 0;
        int howManyTimes = 0;
        System.out.print("Let's play the game. Try to find a random number. Write value You want to check: ");
//        while (!scanner.hasNextInt()) {
//            System.out.print("It is not a number! Write a number, please: ");
//            continue;
//        }
        do {
            checkedNumber = scanner.nextInt();
            String isNUmber = checkedNumber + "";
            howManyTimes++;
            if (checkedNumber > numberToGuess) {
                System.out.print("Too many! Let's try again: ");
            } else if (checkedNumber < numberToGuess) {
                System.out.print("Too little! Let's try again: ");
            } else {
                break;
            }

        } while (true);


        System.out.println("You managed to guess a random number. You needed " + howManyTimes + " attempts.");

    }

}
