// Initialize: Create an array to hold 5 student names.
// Assign: Manually assign a name to the first and last slots (Index 0 and 4).
// Process (for loop): Use a loop to print every name in the array.
// Analyze: Use a loop to find the average of an array of test scores.


// ⌨️ Starter Code (The Whole Project)

public class ArrayProject {
    public static void main(String[] args) {
        
        // --- TASK 1: THE ROSTER ---
        // Create an array of Strings for 5 students
        String[] students = new String[5];
        
        students[0] = "Alice";
        students[1] = "Bob";
        // TODO: Fill in index 2, 3, and 4
        
        System.out.println("Student Roster:");
        // TODO: Write a FOR loop to print each student
        // Hint: use students.length to know when to stop
        for (int i = 0; i < students.length; i++) {
            System.out.println("Seat " + i + ": " + students[i]);
        }


        // --- TASK 2: SCORE ANALYZER ---
        int[] scores = {85, 92, 78, 90, 88};
        int sum = 0;

        System.out.println("\nAnalyzing Scores...");
        // TODO: Use a for-each loop or regular for loop to add all scores to 'sum'
        
        // TODO: Calculate the average (sum divided by scores.length)
        double average = 0; // Update this line

        System.out.println("Class Average: " + average);
    }
}
