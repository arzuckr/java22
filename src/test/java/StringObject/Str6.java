package StringObject;

import java.util.Scanner;

public class Str6 {
    public static void main(String[] args) {


//        # Given a string, return a version where all
//        # the “x” have been removed.
//        # Except an “x” at the very start or
//        #  end should not be removed.
//        # “xxHxix” → “xHix”
//        # “abxxxcd” → “abcd”
//        # “xabxxxcdx” → “xabcdx”

        //To solve this you need:Scanner,replace,concat
        // Replace all the x'es with an empty string,unless they are at the beginning or end
        // I will separate first and last character in the string.

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String str = s.nextLine();



        String firstCh = str.substring(0,1);  // "" + str.charAt(0)
        // Last character in the string
        // What is the last index in str?
        String lastCh = str.substring(str.length()-1); // str.charAt(str.length()-1) + "";

        // How can I find what is in the middle of first and last character?
        String middleStr = str.substring(1,str.length()-1);

        // I will remove the x'es from the middle of the string
        middleStr = middleStr.replace("x",""); // all the x'es removed

        String endVersion = firstCh.concat(middleStr).concat(lastCh); // firstCh + middleStr + lastCh;
        System.out.println(endVersion);


    }
}

