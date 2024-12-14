package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool8 {
    public static void main(String[] args) {


        //Multiple of 3 and 5
// Write a program that takes a number as input and prints
//true if the number is a multiple of both three and five,
// false otherwise.
// Note: Multiple of 3 and 5 means that it could be
// divisible by both 3 and 5.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your number");
        int i= scanner.nextInt();


        boolean isMultiple= (i%3==0) && (i%5==0);
        System.out.println(isMultiple);





    }
}
