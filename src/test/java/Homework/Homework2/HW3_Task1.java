package Homework.Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW3_Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Work days in a month : ");
        int daysWorked = input.nextInt();
        System.out.println("Work hours in a month : ");
        int hoursWorked = input.nextInt();
        System.out.println("Late arrivals in a month : ");
        int lateHours = input.nextInt();
        boolean isQualified = (daysWorked > 20 || hoursWorked > 160) && (lateHours < 2);
        if (isQualified) {
            System.out.println("Employee is qualified ");

        } else {
            System.out.println(" Employee is not qualified ");
        }
    }
}