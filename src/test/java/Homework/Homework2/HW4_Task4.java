package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age= input.nextInt();
       if (age<13){
           System.out.println("You can watch G-rated movies.");
       }else if (age>=13 && age<17) {
           System.out.println("You can watch PG-13 movies.");
       }else if (age>=17 && age<21) {
           System.out.println("You can watch R-rated movies.");
       }else if (age>=21){
           System.out.println("You can watch all movies.");
       }


    }
}
