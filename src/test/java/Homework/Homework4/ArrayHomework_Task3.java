package Homework.Homework4;

import java.util.Scanner;

public class ArrayHomework_Task3 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
         int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter any integer number.You have " + (10 - i) + "space in array");
            numbers[i] = scr.nextInt();
        } System.out.println("The array with all numbers: ");

            for (int num:numbers){
                System.out.println(num+ " ");

        }




    }
}
