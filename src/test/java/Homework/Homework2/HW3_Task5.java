package Homework.Homework2;

import java.util.Scanner;

public class HW3_Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First exam score ");
        int firstExam = input.nextInt();
        double firstExScore = firstExam * 0.20;
        System.out.println("Your first exam score is  " + firstExScore);

        System.out.println("Second exam score ");
        int secondExam = input.nextInt();
        double secondExScore = secondExam * 0.30;
        System.out.println("Your second exam score is  " + secondExScore);

        System.out.println("Third exam score");
        int thirdExam = input.nextInt();
        double thirdExScore = thirdExam * 0.50;
        System.out.println("Your third exam score is  " + thirdExScore);

        double totalScore = (firstExScore + secondExScore + thirdExScore) ;

        System.out.println("Your total score is  " + totalScore);

        System.out.println("Enter your attendance");
        int classAttendance = input.nextInt();

        boolean isPassed = totalScore > 65 && classAttendance > 80;
        if (isPassed) {
            System.out.println("Congratulations ");
        } else {
            System.out.println("You failed ");


        }
    }
}