/*
 * 1) When the user guesses 7, the game announces they have won. All other numbers lose.
 * 2) When the user guesses 0, the game provides instructions for the user.
 * 3) After guessing, the user can take one more guess (unless they won!)
 * 4) When the user guesses -1, the application should exit.
 * 5) The game should provide feedback that the secret number is > or < any incorrect guesses.
 * 6) The number should be random, instead of always 7.
 * Stretch task: Give the user 3 tries before announcing they have lost.
 */

import java.util.Scanner;

public class GuessingGameApp {
    public static void main(String[] args) {
        // Initialize values
        int numberToGuess = 7;
        int userGuess;

        // Initialize input
        Scanner input = new Scanner(System.in);

        // Begin guessing game
        System.out.print("Please guess a number from the range 1 through 10: ");
        userGuess = input.nextInt();

        // Output
        if (userGuess == numberToGuess) {
            System.out.println("Congratulations, you win!!");
        } else {
            System.out.println("You lose... Better luck next time!");
        }
    }
}
