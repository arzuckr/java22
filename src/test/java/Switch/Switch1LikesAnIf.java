package Switch;

import java.util.Scanner;

public class Switch1LikesAnIf {
    public static void main(String[] args) {
        //Ask user to enter  number of the month and then print the name of the month.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month (1-13)");
        int monthNumber = scanner.nextInt();
        if (monthNumber == 1) {
            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");

        }else if(monthNumber==3) {
            System.out.println("March");
        }else if (monthNumber==4) {
            System.out.println("April");
        }else if(monthNumber==5) {
            System.out.println("May");
        }else if(monthNumber==6) {
            System.out.println("June");
        }else if(monthNumber==7) {
            System.out.println("July");
        } else if (monthNumber==8) {
            System.out.println("August");
        } else if (monthNumber==9) {
            System.out.println("September");
        } else if (monthNumber==10) {
            System.out.println("October");
        } else if (monthNumber==11) {
            System.out.println("November");
        } else if (monthNumber==12) {
            System.out.println("December");
        }else{
            System.out.println("Invalid month number! ");

        }

    }

    }











