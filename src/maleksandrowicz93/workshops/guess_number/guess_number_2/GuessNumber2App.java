package maleksandrowicz93.workshops.guess_number.guess_number_2;

import java.util.Scanner;

public class GuessNumber2App {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Pomyśl liczbę, zgadnę ją w max 10 próbach!\nPo każdej mojej próbie daj mi informację zwrotną: więcej, mniej, zgadłeś");
//        while (scanner.hasNext()) {
//            scanner.next();
//            System.err.print("To nie jest liczba! Podaj liczbę, proszę: ");
//        }
//        int yourNumber = scanner.nextInt();
        lookingForNumberByApp();

    }

    static void lookingForNumberByApp() {

        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 1000;
        int count = 0;
        do {
            int number = (min + max)/2;
            count++;
            System.out.println("Czy ta liczba to " + number + "?");
            String userFeedback = scanner.next();
            if (userFeedback.equalsIgnoreCase("zgadłeś")) {
                System.out.println("Brawo ja! Zgadłen w " + count + " próbach!");
                break;
            } else if (userFeedback.equalsIgnoreCase("więcej")) {
                min = number;
                continue;
            } else if (userFeedback.equalsIgnoreCase("mniej")) {
                max = number;
            } else {
                System.out.println("Nie rozumiem :(");
            }
        } while (true);
    }

}
