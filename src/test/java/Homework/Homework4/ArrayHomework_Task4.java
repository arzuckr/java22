package Homework.Homework4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayHomework_Task4 {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        Arrays.sort(numbers);
        System.out.println("Sorted array is " +Arrays.toString(numbers));
        int firstLargestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;
        for (int num:numbers) {
            if (num>firstLargestNumber){
                secondLargestNumber=firstLargestNumber;
                firstLargestNumber=num;
            }else if(num>secondLargestNumber && num<firstLargestNumber){
                secondLargestNumber=num;

            }
        }
            System.out.println("Second largest number is " + secondLargestNumber);
        }

    }


