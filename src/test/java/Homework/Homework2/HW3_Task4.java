package Homework.Homework2;

import java.util.Scanner;

public class HW3_Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your password lenght ");
        int passwordLenght= input.nextInt();
        System.out.println("Do you have special character? ");
        boolean hasSpecialChar= input.nextBoolean();
        System.out.println("Do you have any spaces? ");
        boolean hasSpace= input.nextBoolean();

        boolean isPasswordValid=passwordLenght>=8 && hasSpecialChar && !hasSpace;
        System.out.println("Result is "+ isPasswordValid);

    }
}
