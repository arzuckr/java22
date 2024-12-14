package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your daily step: ");
        int dailySteps= input.nextInt();
                   if(dailySteps>15000) {
                     System.out.println("Activity level ");
                 } else if(dailySteps>10000) {
                     System.out.println("High activity ");
                 } else if(dailySteps>5000) {
                     System.out.println("Moderate activity ");
                 } else{
                     System.out.println("Basic activity");
                         }
                     }

            }




