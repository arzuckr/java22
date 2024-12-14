package Homework.Homework2;

import java.util.Scanner;

public class HW4_Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your annual income: ");
        int annualIncome= input.nextInt();
        System.out.println("Enter your credit score: ");
        int creditScore= input.nextInt();
        System.out.println("Do you have a cosigner? ");
        boolean hasCosigner= input.nextBoolean();
        boolean isEligible=age>=21 && age<=65 && annualIncome>=30000 && creditScore>=700;

        if (isEligible) {

            System.out.println("Loan Approved");
        }else if (creditScore<700 && hasCosigner) {
                System.out.println("Loan requires cosigner");
        } else if(creditScore<700 ){
                System.out.println("Loan Denied");
        }
        }

    }

