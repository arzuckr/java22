package Homework.Homework2;

import java.util.Scanner;

public class HW1_Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter temperature ");
        double givenFahrenheit= input.nextDouble();
        double fToC=(givenFahrenheit-32) * 5/9;
        System.out.println("Converted Value "+ fToC + " Celcius");





    }
}
