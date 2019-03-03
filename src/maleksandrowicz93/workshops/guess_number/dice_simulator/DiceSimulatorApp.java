package maleksandrowicz93.workshops.guess_number.dice_simulator;

import java.util.Scanner;

public class DiceSimulatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfDices = scanner.nextInt();
        int typeOfDices = scanner.nextInt();
        int modifier = scanner.nextInt();
        String diceCode = numberOfDices + "D" + typeOfDices + "+" + modifier;
        diceRolling(diceCode);


    }

    static void diceRolling (String diceCode) {

        System.out.println(diceCode);

    }
}
