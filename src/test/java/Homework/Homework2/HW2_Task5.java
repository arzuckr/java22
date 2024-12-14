package Homework.Homework2;

import java.util.Scanner;

public class HW2_Task5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number ");
        int num1= input.nextInt();
        System.out.println("Please enter second number");
        int num2= input.nextInt();
        System.out.println("Please enter third number");
        int num3= input.nextInt();
        if ( num1==num2 || num2==num3){
            System.out.println("Result is true ");
        }else {
            System.out.println("Result is false ");
        }
        }

    }

