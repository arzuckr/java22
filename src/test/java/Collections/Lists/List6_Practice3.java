package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List6_Practice3 {
    public static void main(String[] args) {
        //given list of integer ,write a programme to find a difference between the max
        //and the min values in the list
        //Example
        //Input [8,2,14,5,9]
        //Output 12(14-2)

        List<Integer>numbers=new ArrayList<>();
        Collections.addAll(numbers,8,2,14,5,9);
        int maxNumber=numbers.get(0);
        int minNumber=numbers.get(0);
        for (int element:numbers ){
           if (element>maxNumber){
              maxNumber=element;

           }
            if (element<minNumber){
                minNumber=element;
            }
        }

        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(maxNumber-minNumber);






    }
}
