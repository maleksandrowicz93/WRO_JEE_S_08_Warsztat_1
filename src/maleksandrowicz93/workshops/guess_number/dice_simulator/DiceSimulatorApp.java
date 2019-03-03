package maleksandrowicz93.workshops.guess_number.dice_simulator;

import java.util.Random;
import java.util.Scanner;

public class DiceSimulatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość rzutów kością: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("Niewłasciwa wartość! Podaj ilość kości: ");
        }
        int numberOfDices = scanner.nextInt();
        System.out.print("Podaj ilość ścianek kości: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("Niewłasciwa wartość! Podaj rodzaj kości: ");
        }
        int typeOfDices = scanner.nextInt();
        System.out.print("Podaj modyfikator rzutu: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("Niewłasciwa wartość! Podaj modyfikator rzutu: ");
        }
        int modifier = scanner.nextInt();
        String diceCode = numberOfDices + "D" + typeOfDices + "+" + modifier;
        diceRolling(diceCode);


    }

    static void diceRolling (String diceCode) {

//        Random random = new Random();
        System.out.println(diceCode);

    }
}
