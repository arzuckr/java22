package ForLoop;

import java.util.Scanner;

public class ForLoop6_Intro {
    public static void main(String[] args){

    //Let's print
    //Ask user to how many lines of output they would like to see
    //Our lines should look like
    //1
    //1 2
    // 1 2 3
    //1 2 3 4
    //1 2 3 4 5
    //1 2 3 4 5 6
    //1 2 3 4 5 6 7

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of line you want to print " );
        int lineNumber=scanner.nextInt();
        for(int currentLine=1;currentLine<=lineNumber;currentLine++){
            System.out.println("Currently we are in line"+currentLine);
            //I need to print from 1 to current line number.

            for(int numbersInTheLine=1;numbersInTheLine<=currentLine;numbersInTheLine++){
                System.out.println(numbersInTheLine+ " ");

            }
            System.out.println();

        }



    }
}
