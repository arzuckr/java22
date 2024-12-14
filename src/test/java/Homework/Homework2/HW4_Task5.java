package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What temperature is the weather today?");
        int temp= input.nextInt();

        if(temp>=40) {
            System.out.println("It is very hot.");
        }else if (temp>30){
            System.out.println("It is hot.");
        }else if (temp>20) {
            System.out.println("It is normal.");
        }else if (temp>10) {
            System.out.println("It is cold weather.");
        } else if (temp>0) {
            System.out.println("It is very cold.");
        }else {
            System.out.println("It is freezing.");
        }
    }
    }


