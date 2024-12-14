package StringObject;

import java.util.Scanner;

public class Str7 {
    public static void main(String[] args) {

//        # Given a string, print True if "bad" appears starting at
//        # index 0 or 1 in the string, such as with "badzzz" or
//        # "zbaddzzzz" but not "zzbadzzzzz".
//        # The string may be any length, including 0.
//        # it will return me where the word 'bad'
//        # starts in the string.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        //How could I learn starting index of word 'bad'  in a string.
        //Use indexOf method

        int startingIndexBad = str.indexOf("bad");
        //What will be the value of the above= -1
        boolean result=startingIndexBad==1 || startingIndexBad ==0 ;
        if (startingIndexBad == 1 || startingIndexBad == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");


        }
    }
}