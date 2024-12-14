package Homework.Homework2;

import javax.swing.*;
import java.util.Scanner;

public class HW3_Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter order amount ");
        int orderAmount = input.nextInt();

        System.out.println("Are you a premium member? ");
        boolean premiumMember = input.nextBoolean();

        System.out.println("Has the order restricted items? ");
        boolean hasRestrictedItems = input.nextBoolean();
        boolean isFreeDelivery = (orderAmount >= 50 || premiumMember) && !hasRestrictedItems;
        if (isFreeDelivery) {
            System.out.println("Customer can order ");
        } else {
                System.out.println("Customer can not order ");

            }

        }
    }

