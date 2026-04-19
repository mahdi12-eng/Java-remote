// The Countdown (for): Create a loop that counts down from 5 to 1 for a "Rocket Launch."
// The User Gatekeeper (while): Create a loop that keeps asking for a password until the user gets it right.
// The Menu Repeater (do-while): Ensure the program menu displays at least once and only closes when the user chooses to "Exit."

// Starter Code (The Whole Project)

import java.util.Scanner;

public class LoopMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;

        // TASK 1: DO-WHILE LOOP
        // Use this to keep the entire program running until the user chooses to exit (3).
        do {
            System.out.println("\n--- Day 6: Loop Menu ---");
            System.out.println("1. Rocket Launch (for loop)");
            System.out.println("2. Secure Login (while loop)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.println("Starting Countdown...");
                    // TASK 2: FOR LOOP
                    // TODO: Write a loop that starts at 5, ends at 1, and counts down (i--)
                    // Inside: Print the number and then "Blast off!" at the end.
                    break;

                case 2:
                    int pin = 1234;
                    int entry = 0;
                    // TASK 3: WHILE LOOP
                    // TODO: While 'entry' is NOT equal to 'pin', keep asking for the pin.
                    // Inside: Print "Access Denied" if wrong.
                    System.out.println("Access Granted!");
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (menuChoice != 3); // Keeps running until choice is 3

        scanner.close();
    }
}
