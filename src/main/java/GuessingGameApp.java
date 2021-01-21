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
        int remainingGuesses = 2;
        int userGuess;

        // Initialize input
        Scanner input = new Scanner(System.in);

        // Begin guessing game
        while (remainingGuesses > 0) {
            System.out.println("Remaining guesses : " + remainingGuesses);
            System.out.print("Please guess a number (input '0' for help): ");
            userGuess = input.nextInt();

            // Output
            if (userGuess == numberToGuess) {
                System.out.println("__   __                     _       _ _ \n" +
                        "\\ \\ / /                    (_)     | | |\n" +
                        " \\ V /___  _   _  __      ___ _ __ | | |\n" +
                        "  \\ // _ \\| | | | \\ \\ /\\ / / | '_ \\| | |\n" +
                        "  | | (_) | |_| |  \\ V  V /| | | | |_|_|\n" +
                        "  \\_/\\___/ \\__,_|   \\_/\\_/ |_|_| |_(_|_)\n" +
                        "Want to play again?");
                break;
            } else if (userGuess == 0) {
                System.out.println("***************\n" +
                                "* How to play *\n" +
                                "***************\n" +
                                "- Guess a number in the range 1 through 10\n" +
                                "- You have two chances to get it correct, or else it's game over :)\n" +
                                "- After an incorrect guess, you'll get a hint if the number is higher or lower than your guess\n" +
                                "- To access this help menu, type '0'\n" +
                                "- To quit the game, type '-1'\n");
            } else if (userGuess == -1){
                // exit the application
            } else {
                remainingGuesses--;
            }
        }
        if (remainingGuesses == 0) {
            System.out.println("__   __            _                      \n" +
                    "\\ \\ / /           | |                     \n" +
                    " \\ V /___  _   _  | | ___  ___  ___       \n" +
                    "  \\ // _ \\| | | | | |/ _ \\/ __|/ _ \\      \n" +
                    "  | | (_) | |_| | | | (_) \\__ \\  __/_ _ _ \n" +
                    "  \\_/\\___/ \\__,_| |_|\\___/|___/\\___(_|_|_)\n" +
                    "Better luck next time...");
        }
    }
}
