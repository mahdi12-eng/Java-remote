// ⚖️ The Comparison
// Array: Fixed size. You must know the length at the start.
// ArrayList: Resizable. You can add() and remove() items anytime.
// Import: Add import java.util.ArrayList; at the top of the file.
// Create: Initialize an ArrayList of Strings called shoppingList.
// Modify: Add 3 items, remove 1 item, and change an item at index 0.
// Compare: Print the size of the list using .size() (instead of .length).

// ⌨️ Starter Code (The Whole Project)

import java.util.ArrayList; // MUST IMPORT THIS

public class ListProject {
    public static void main(String[] args) {
        
        // 1. ARRAY (The Fixed Way)
        String[] arrayFixed = new String[3];
        arrayFixed[0] = "Milk";
        // arrayFixed[3] = "Eggs"; // ERROR! The array is full.

        // 2. ARRAYLIST (The Flexible Way)
        // TODO: Initialize an ArrayList of Strings
        ArrayList<String> listDynamic = new ArrayList<>();

        // TASK: Add "Milk", "Bread", and "Eggs" to the list
        listDynamic.add("Milk");
        
        // TODO: Add the other two items

        // TASK: Remove an item
        // TODO: Remove "Bread" from the list
        
        // TASK: Modify an item
        // TODO: Use .set(index, newValue) to change "Milk" to "Organic Milk"

        System.out.println("--- Current Shopping List ---");
        
        // TASK: Loop through the ArrayList
        // Hint: Use .size() for the limit and .get(i) to see the item
        for (int i = 0; i < listDynamic.size(); i++) {
            System.out.println("Item " + (i+1) + ": " + listDynamic.get(i));
        }

        // 3. SHOW THE DIFFERENCE
        System.out.println("\nList Stats:");
        System.out.println("Array size is locked at: " + arrayFixed.length);
        System.out.println("ArrayList size is currently: " + listDynamic.size());
    }
}
