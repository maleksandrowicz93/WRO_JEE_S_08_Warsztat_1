package maleksandrowicz93.workshops.guess_number.guess_number_2;

import java.util.Scanner;

public class GuessNumber2App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number. I guess it in max 10 attempts!");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("It is not a number! Write a number please: ");
        }
        int yourNumber = scanner.nextInt();
        lookinfForNumberByApp(yourNumber);

    }

    static void lookinfForNumberByApp (int yourNumber) {
        return;
    }

}
