package task.pkg1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        // askint the amount fo x from user
        System.out.println("please enter the amount of x: ");;
        int x = ali.nextInt();
        // asking the amount of y form user
        System.out.print("please enter the amount of y: ");
        int y = ali.nextInt();
        // operation of the sum
        int result = x + y;
        // the final statement to show the result
        System.out.println("the sum of " + x + " and " + y + " is " + result );
    }

}
