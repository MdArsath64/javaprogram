// Number game
package Codesoft;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int totalAttempts = 0; // Total attempts taken in all rounds
        int roundsWon = 0; // Number of rounds won by the user
        int totalRounds = 0; // Total number of rounds played

        System.out.println("Number guessing game");
        System.out.println("---------------------------");

        while (playAgain) {
            int rand = (int) (Math.random() * 101);//Generating random number
            int user, attempt = 0;
            boolean correctGuess = true;//it is changes as false when user find correct random number
            totalRounds++;

            System.out.println("Guess the correct random number within 10 attempts");

            while (attempt < 10 && correctGuess) {
                attempt++;
                System.out.println("Enter your guessing number:");
                user = sc.nextInt();

                if (user > rand) {
                    System.out.println("Your guess is too high, try again!");
                } else if (user < rand) {
                    System.out.println("Your guess is too low, try again!");
                } else {
                    System.out.println("Congratulations! Your guess was right!");
                    correctGuess = false;
                    roundsWon++;
                }

                if (attempt == 10 && correctGuess) {
                    System.out.println("Maximum attempts reached. The correct number was " + rand + ".");
                }
            }

            totalAttempts += attempt;

            System.out.println("Do you want to play again? (yes/no):");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Display the user's score
        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Rounds won: " + roundsWon);

        sc.close();
    }
}
