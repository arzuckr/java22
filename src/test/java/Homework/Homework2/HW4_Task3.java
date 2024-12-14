package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your usage amount: ");
        int usedAmount= input.nextInt();
        double rate1=0.50;
        double rate2=0.75;
        double rate3=1.20;
        double rate4=1.50;
        double billAmount;
        if(usedAmount>500) {
            billAmount = usedAmount * rate4;
            System.out.println("Your bill amount is $" + billAmount);
        }else if(usedAmount>300) {
            billAmount = usedAmount * rate3;
            System.out.println("Your bill amount is $" + billAmount);
        }else if(usedAmount>100) {
            billAmount = usedAmount * rate2;
            System.out.println("Your bill amount is $" + billAmount);
        } else {
            billAmount = usedAmount * rate1;
            System.out.println("Your bill amount is $" + billAmount);
            }
        }
    }

