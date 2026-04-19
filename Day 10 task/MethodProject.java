// ⚖️ The Nuance
// Function: A standalone block of code (common in languages like C or Python).
// Method: A function that "belongs" to a class (everything in Java).
// Define: Create a method outside of the main method.
// Pass Data: Give the method parameters (like two numbers to add).
// Return Data: Use the return keyword to send a result back to the main method.
// Invoke: Call your method multiple times with different values.

// ⌨️ Starter Code (The Whole Project)

public class MethodProject {

    // MAIN METHOD: Where the program starts
    public static void main(String[] args) {
        System.out.println("--- Math Tool ---");

        // TASK 1: Call the 'add' method and store the result
        int sum = addNumbers(10, 5);
        System.out.println("The sum is: " + sum);

        // TASK 2: Call the 'greetUser' method
        // TODO: Call greetUser with your name
        
        // TASK 3: Call the 'calculateArea' method
        // TODO: Print the result of a rectangle with width 5 and height 10
    }

    // --- YOUR TASKS BELOW ---

    // 1. A method that returns a value (int)
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 2. A VOID method (does not return anything, just prints)
    public static void greetUser(String name) {
        // TODO: Print "Hello, [name]! Welcome to Day 10."
    }

    // 3. A method with logic
    public static int calculateArea(int width, int height) {
        // TODO: Multiply width by height and return the result
        return 0; // Update this
    }
}
