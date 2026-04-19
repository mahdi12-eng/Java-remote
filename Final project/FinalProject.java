// 🚀 The Mission
// Build a system that allows a teacher to:
// Input student names and their exam scores.
// Calculate grades using complex logic (if/else and Math).
// Search for students and filter out specific results.
// Analyze performance using advanced methods and recursion.
// ✅ Submission Requirements
// To pass the "Java Basics" phase, mentees must submit a single .java file that includes:
// Documentation: At least one multi-line comment explaining the project and five single-line comments for logic.
// Correct Syntax: No missing semicolons or mismatched braces.
// Variable Usage: Must use at least three different data types (e.g., String, int, double, boolean).
// Data Structures: Must use an ArrayList to store student data.
// Methods: At least one overloaded method and one recursive method.
// Looping: A do-while loop to keep the main menu active.
// ⌨️ Starter Code (The Final Project)

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * PROJECT: Smart Student Manager
 * AUTHOR: [Mentee Name]
 * DAY: Final Capstone (1-12)
 */

public class FinalProject {
    
    // Global List to store student names (Day 9)
    static ArrayList<String> students = new ArrayList<>();
    static ArrayList<Double> grades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Day 12 Capstone System!");

        do {
            showMenu(); // Day 10: Method call
            choice = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (choice) { // Day 5: Switch
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    displayAll(); // Day 6 & 8: Loops and Arrays
                    break;
                case 3:
                    System.out.println("Average: " + calculateStats()); 
                    break;
                case 4:
                    System.out.print("Enter number for countdown: ");
                    int start = input.nextInt();
                    recursiveTimer(start); // Day 12: Recursion
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5); // Day 6: Do-While
    }

    // --- TASK: CREATE THE METHODS BELOW ---

    public static void showMenu() {
        System.out.println("\n1. Add Student\n2. View All\n3. Class Stats\n4. System Timer\n5. Exit");
        System.out.print("Selection: ");
    }

    public static void addStudent(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Score: ");
        double score = sc.nextDouble();

        // TODO Day 4: Use if/else to check if score is valid (0-100)
        // TODO Day 9: Add name and score to the ArrayLists
    }

    // TODO Day 11: Method Overloading
    // Create calculateStats() that returns the average of all grades.
    // Create calculateStats(double bonus) that adds a bonus to all grades first.

    // TODO Day 12: Recursion
    public static void recursiveTimer(int n) {
        // Create a countdown that prints n, then calls itself with n-1
        // Stop at 0 (Base Case)
    }

    public static void displayAll() {
        System.out.println("\n--- Student List ---");
        // TODO Day 6 & 7: Loop through the list. 
        // Use 'continue' to skip any student named "Test".
        // Print the name and the grade.
    }
}
