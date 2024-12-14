package Homework.Homework2;

import java.util.Scanner;

public class HW2_Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle: ");
        double lenght = input.nextDouble();
        System.out.println("Please enter the width of the Rectangle: ");
        double width= input.nextDouble();
        //Calculate the area

        int area= (int) (lenght*width);
        System.out.println("Area of rectangle is  "+ area);





    }
}
