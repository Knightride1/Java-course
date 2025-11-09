import java.util.Scanner;
import java.util.Random;

public class number_guessing_game {
    public static void main(String[] args) {
        // generate a random number between 1 and 100 and then guess it
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + number + " in " + attempts + " attempts.");
            }   
        }
    }
}
