package Homework.Homework2;

import java.util.Scanner;

public class HW3_Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the the viewer age: ");
        int viewerAge = input.nextInt();
        boolean isViewerEligible = viewerAge > 21;
        System.out.println("Do you have parental consent ");
        boolean hasConsent= input.nextBoolean();

        boolean isEligible = (viewerAge>=18) && (viewerAge <21 && hasConsent);

        if (isEligible) {
            System.out.println("Customer can watch the movie");
        } else {
            System.out.println("Customer cannot watch the movie");
        }
    }
}