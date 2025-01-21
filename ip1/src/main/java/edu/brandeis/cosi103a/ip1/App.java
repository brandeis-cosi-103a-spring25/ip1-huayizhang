package edu.brandeis.cosi103a.ip1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int player1Score = 0;
        int player2Score = 0;
        int turns = 10;

        for (int turn = 1; turn <= turns; turn++) {
            System.out.println("Turn " + turn + " for Player 1");
            player1Score += takeTurn(scanner, random);
            System.out.println("Player 1's total score: " + player1Score);

            System.out.println("Turn " + turn + " for Player 2");
            player2Score += takeTurn(scanner, random);
            System.out.println("Player 2's total score: " + player2Score);
        }

        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static int takeTurn(Scanner scanner, Random random) {
        int roll = rollDie(random);
        System.out.println("You rolled a " + roll);
        for (int reroll = 0; reroll < 2; reroll++) {
            System.out.print("Do you want to re-roll? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                roll = rollDie(random);
                System.out.println("You rolled a " + roll);
            } else {
                break;
            }
        }
        return roll;
    }

    public static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }
}
