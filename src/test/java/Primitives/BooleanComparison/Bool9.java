package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool9 {
    public static void main(String[] args) {

        //  John wants to lose 10 pounds in one month.
// There are multiple conditions to lose 10 pounds in a month.
// John needs to walk 10000 steps daily  OR needs to run at
// least 4 miles a day.  and Addition to these, John needs to
// eat less than 1500 calories daily. We should create a
// program to calculate if John can lose weight or not.
// daily steps, running distance and daily caloric intake
// will be given by user. Our goal is to print true when
//  John can lose weight and print false otherwise.
        // Note: If && and || is used in a same
        // && will be calculated before ||

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the daily caloric intake");
        int dailyIntake= scanner.nextInt();
        System.out.println("Enter the daily running distance");
        int runningDistance= scanner.nextInt();
        System.out.println("enter the daily steps that you have completed");
        int stepsDaily= scanner.nextInt();


        //To lose 10 pounds there is two condition:1 st is movement,2nd is caloric intake
        boolean isMovement= stepsDaily>=10000 || runningDistance >=4;
        boolean isDiet=dailyIntake<1500;
        boolean canLose=isMovement && isDiet;

        System.out.println("Can lose the 10 pound " + canLose);












    }
}
