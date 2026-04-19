// Day 7: Flow Control – break and continue
// The goal today is to master interrupting loops.
// break: Stops the loop entirely (The "Emergency Exit").
// continue: Skips the current round and jumps to the next one (The "Skip This Step").

// The Smart Counter: Write a loop from 1 to 10.
// The Skip Logic (continue): Use an if statement to skip the number 5.
// The Stop Logic (break): Use an if statement to stop the loop completely when it hits 8.
// The Input Loop: Create a while loop that only stops if the user types "STOP".


// ⌨️ Starter Code (The Whole Project)

import java.util.Scanner;

public class FlowControlProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- TASK 1: THE NUMBER FILTER ---
        System.out.println("Counting from 1 to 10 (Skipping 5, Stopping at 8):");
        
        for (int i = 1; i <= 10; i++) {
            // TODO: Use 'continue' to skip the number 5
            if (i == 5) {
                // Hint: print "Skipping..." and then use continue;
            }

            // TODO: Use 'break' to exit the loop when i reaches 8
            if (i == 8) {
                // Hint: print "Breaking at 8..." and then use break;
            }

            System.out.println("Number: " + i);
        }

        System.out.println("\n--- TASK 2: THE INFINITE CHAT ---");
        
        // This loop is set to run forever (true)
        while (true) {
            System.out.print("Type something (or 'STOP' to exit): ");
            String input = scanner.nextLine();

            // TODO: If input equals "STOP", use 'break' to end the loop
            // Hint: Use input.equalsIgnoreCase("STOP")
            
            System.out.println("You said: " + input);
        }

        // System.out.println("Successfully exited the chat!");
        scanner.close();
    }
}
