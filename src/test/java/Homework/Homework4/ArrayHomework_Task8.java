package Homework.Homework4;

import java.util.ArrayList;
import java.util.List;

public class ArrayHomework_Task8 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4};
        for (int i = 0; i < numbers.length ; i++) {
            boolean isUnique= true;
            for (int j = 0; j < numbers.length ; j++) {
                if (i!=j && numbers [i]==numbers[j]){
                    isUnique = false;
                    break;
                }

            }

            if (isUnique){
                System.out.println(numbers[i]);
            }

        }

    }}


