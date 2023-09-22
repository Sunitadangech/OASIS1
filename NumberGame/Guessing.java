import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int totalScore = 0;
        int rounds = 3;

        System.out.println("Welcome to the Number Guessing Game!");

        for (int round = 1; round <= rounds; round++) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attemptsLeft = maxAttempts;
            int roundScore = 0;

            System.out.println("\nRound " + round + ":");
            System.out.println("You have " + attemptsLeft + " attempts.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    roundScore = attemptsLeft * 10; // Give points based on remaining attempts
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                attemptsLeft--;
            }

            totalScore += roundScore;
            System.out.println("Round " + round + " score: " + roundScore);
        }

        System.out.println("\nGame Over!");
        System.out.println("Total Score: " + totalScore);

        scanner.close();
    }
}
