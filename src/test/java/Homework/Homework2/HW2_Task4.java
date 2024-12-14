package Homework.Homework2;

import java.util.Scanner;

public class HW2_Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1= input.nextInt();
        System.out.println("Enter the second number : ");
        int number2= input.nextInt();
        System.out.println("Enter the third number : ");
        int number3= input.nextInt();
        boolean allEqual=(number1==number2)&&(number2==number3);
        System.out.println("Result = " + allEqual);

    }
}
