package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your monthly usage: ");
        int householdUsage = input.nextInt();

        if (householdUsage > 4000) {
            System.out.println("Fine");
        } else if (householdUsage > 3000) {
            System.out.println("Warning Letter");
        } else if (householdUsage > 2000) {
            System.out.println("Normal range");
        } else if(householdUsage<2000){
            System.out.println("Congratulations");
        }
    }
}
