package Primitives.BooleanComparison.ScannerUsage;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        // Creating a scanner object
        Scanner input = new Scanner(System.in);
        // Creating a specific scanner method to get expected data types

        System.out.println("Please enter your age on next line.");
        // 1. Getting an integer variable
        int age = input.nextInt();

        System.out.println("User's age is -> " + age);

        // 2. Getting a double value from user
        System.out.println("Please enter a decimal value on next line.");
        double d1 = input.nextDouble();
        System.out.println("Your decimal value is "+ d1);

        // 3. Getting a text from user (we will cover this in detail)
        System.out.println("Please enter your name on next line.");
        // To store text we use String data type(Object).
        String name = input.next();

        System.out.println("Your name is " + name);







    }
}
