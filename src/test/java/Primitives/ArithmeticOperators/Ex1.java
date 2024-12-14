package Primitives.ArithmeticOperators;

import org.w3c.dom.ls.LSOutput;

public class Ex1 {



    //In a farm we have 20 cows,48 ducks,and 14 cats.
    //calculate the total number of legs in the farm and
    //display the result.
    //Don't only display the result, at least 6 different variables
    //created and result is calculated using variable names.
    public static void main(String[] args) {


        int cows = 20;
        int cowsLegs = 4;

        int ducks = 48;
        int ducksLegs = 2;

        int cats = 14;
        int catsLegs = 4;
        int totalLegsOfAnimals = (cows * cowsLegs) + (ducks * ducksLegs) + (cats * catsLegs);

        System.out.println("Total Legs of Animals in the Farm:"+totalLegsOfAnimals);
    }
}
