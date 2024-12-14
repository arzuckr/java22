package Homework.Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework_Task2 {
    public static void main(String[] args) {
        String [] names={"Arzu","Yasin","Onur","Kerem"};
        System.out.println("Please enter any name:");
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("Please enter index number minimum than:" + names.length);
        int index = scn.nextInt();

        if(index>=0 && index< names.length){
            names[index]=name;
        }

        System.out.println("New names are" + Arrays.toString(names));
    }
}
