package Homework.Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework_Task1 {
    public static void main(String[] args) {
        int [] numbers={10,4,3,55,32,145,443,234,98,32};
        System.out.println("Enter one of the numbers given: " + Arrays.toString(numbers));
        Scanner scr=new Scanner(System.in);
        int input= scr.nextInt();
        for (int i=0;i< numbers.length;i++){
            if(numbers[i]==input){
                numbers[i]=0;

            }

        }
        System.out.println("New array after input"+Arrays.toString(numbers));


    }
}
