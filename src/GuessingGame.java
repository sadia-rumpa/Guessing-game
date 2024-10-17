
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The correct name to guess
        String correctName = "Emma";
        String guess = "";
        int attempts = 3;

        // Keep asking until the correct guess or the user types "stop"
        while (!guess.equalsIgnoreCase(correctName) && !guess.equalsIgnoreCase("stop")) {
            System.out.println("Guess my name (type stop to exit)");
            guess = scanner.nextLine();
            attempts++;  // Increment the attempts each time

            // Check if the guess is correct
            if (guess.equalsIgnoreCase(correctName)) {
                System.out.println("Congratulations! you have the correct name");
            }
        }

        // Print how many times the user guessed
        System.out.println("You guessed " + attempts + " times.");
    }
}
