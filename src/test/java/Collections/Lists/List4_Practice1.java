package Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4_Practice1 {
    public static void main(String[] args) {
        //Let's create a list called colors.
        //Store 5 colors in the list,print out the colors only first letter is uppercase
        //rest is lowercase

        List<String>colors=new ArrayList<>();
        Collections.addAll(colors,"red","YeLLOw","blue","blACK","whITe");

        for (int i = 0; i<colors.size(); i++) {
            //Using substring get the first letter from the element
           String firstUp =colors.get(i).substring(0,1).toUpperCase();
            //using substring get the rest of teh letters from element
           String restLo= colors.get(i).substring(1).toLowerCase();

            System.out.println(firstUp+restLo+" ");

        }

        //Print  each element from the list in upper case ,starting from
        //last element in the list to first element in teh list

        for (int i=colors.size()-1;i>0;i--) {
            System.out.println(colors.get(i).toUpperCase());
        }





        }



    }

