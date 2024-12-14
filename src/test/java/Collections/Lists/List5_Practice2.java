package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5_Practice2 {
    public static void main(String[] args) {
        //Given a list of integers,write a program to remove duplicate
        //elements and print the list with unique values only

        /*
Input: [4, 5, 4, 8, 5, 2, 2, 8]
Output: [4, 5, 8, 2]
 */

            List<Integer> numbers = new ArrayList<>();
            Collections.addAll(numbers, 4, 5, 4, 8, 5, 2, 2, 8);

            List<Integer> uniqueValue = new ArrayList<>();
         // we will loop through the numbers list and for each element we will check
        //if the unique values list contains the element ,if it doesn't contain
        //the element then we add that element to the unique values.

         for(int element:numbers){
             if (!uniqueValue.contains(element)){
                 uniqueValue.add(element);
             }

        }
        System.out.println(uniqueValue);

        }

    }
