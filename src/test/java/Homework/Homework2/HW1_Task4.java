package Homework.Homework2;

import java.util.Scanner;

public class HW1_Task4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your meter");
        int givenMeter= input.nextInt();
        double converter=3.281;
        double meterToFoot=givenMeter*converter;
        System.out.println("Converted Length "+meterToFoot +" foot");
        int cm=100;
        int meterToCm=givenMeter*cm;
        System.out.println("Converted Length "+meterToCm + " cm");


    }
}
