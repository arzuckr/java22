package Homework.Homework4;

import java.util.Scanner;

public class ArrayHomework_Task7 {
    public static void main(String[] args) {
        int [] numbers={2,5,7,9,11,15};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < 10; j++) {
                int multiplied  =   numbers[i] * j;
                System.out.println("Thr result is : "+ multiplied) ;
            }

        }

    }
}
