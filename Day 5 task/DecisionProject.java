// Selection Logic: Use a switch statement to let the user choose between a Weather Adviser or a Grade Calculator.
// Weather Tool (if/else): If the temperature is above 30, suggest "Water"; if below 15, suggest "Coat"; otherwise, suggest "Normal".
// Grade Tool (switch): Take a Letter Grade (A, B, C) and print a specific feedback message for each.
// Error Handling: Use default in both switches to handle invalid inputs.

// Starter code

import java.util.Scanner;

public class DecisionProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Multi-Tool!");
        System.out.println("Select a tool: 1 (Weather) or 2 (Grades)");
        int toolChoice = input.nextInt();

        // TASK 1: Use a SWITCH to handle the tool selection
        switch (toolChoice) {

            case 1:
                System.out.println("Enter current temperature (Celsius):");
                int temp = input.nextInt();
                
                // TASK 2: Use IF/ELSE for temperature ranges
                // TODO: If temp > 30, print "Stay hydrated!"
                // TODO: Else if temp < 15, print "Wear a jacket!"
                // TODO: Else, print "Perfect weather."
                break;

            case 2:
                System.out.println("Enter your grade (A, B, or C):");
                char grade = input.next().toUpperCase().charAt(0);

                // TASK 3: Use SWITCH for specific grade feedback
                // TODO: Case 'A': Print "Excellent work!"
                // TODO: Case 'B': Print "Good job!"
                // TODO: Case 'C': Print "You can do better."
                // TODO: Add a default for invalid grades
                break;

            default:
                System.out.println("Invalid tool selection.");
        }
        
        input.close();
        System.out.println("Program finished.");
    }
}
