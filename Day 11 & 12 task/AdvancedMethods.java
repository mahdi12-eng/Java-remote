// Days 11 & 12: Advanced Methods – Overloading & Recursion
// For these two days, we move beyond simple math. We will cover Method Overloading (same name, different inputs) and Recursion (a method that calls itself).
// Method Overloading: Create two methods named multiply. One for two integers, and one for three integers. Java will "know" which one to use!
// Base Case: In recursion, create an if statement that stops the loop so the program doesn't crash.
// Recursive Logic: Write a method that calculates a Factorial (e.g., 5! = 54321).

// ⌨️ Starter Code (The 2-Day Project)

public class AdvancedMethods {

    public static void main(String[] args) {
        // --- DAY 11: OVERLOADING ---
        System.out.println("Result 1 (2 numbers): " + multiply(5, 4));
        // TODO: Call the second multiply method with THREE numbers (2, 3, 4)
        
        
        // --- DAY 12: RECURSION ---
        int num = 5;
        long factResult = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factResult);
        
        // CHALLENGE: Try to call 'countDown' from 10 to 0 using recursion
    }

    // TASK 1: Method Overloading
    // This version handles two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // TODO: Create another 'public static int multiply' that takes THREE ints (a, b, c)
    // Return the product of all three.


    // TASK 2: Recursion (The Factorial)
    public static long factorial(int n) {
        // TODO: Create a "Base Case" 
        // If n is 1 or less, return 1 (This stops the recursion)
        
        // TODO: Create the recursive call
        // Hint: return n * factorial(n - 1);
        return 0; 
    }

    // TASK 3: Recursive Countdown
    public static void countDown(int n) {
        // TODO: If n is 0, print "Lift off!" and return
        // TODO: Else, print n and call countDown(n - 1)
    }
}
