package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool10 {
    public static void main(String[] args) {
        //  Leap Year(if the year has 366 days)
// A year is leap if it is divisible by 4 but not by 100
// unless it is also divisible by 400.
// Write a program that takes a year as input
// and prints true if it's a leap year, false otherwise.


        Scanner scanner =new Scanner(System.in);
        // If the year is divisible by 400 no need to look other conditions
        // it is a leap year.
        // OR
        // However, if it is divisible by 4 then we have to make sure
        // it is not divisible by 100.

        int year= scanner.nextInt();
       boolean isLeapYear= year %400==0 || year %4 ==0 &&  year %100 !=0;

        System.out.println("Given year "+ year + " is a leap year. -> " + isLeapYear);

    }
}









