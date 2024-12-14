package Primitives.BooleanComparison;

public class Boolean2 {
    public static void main(String[] args) {
        //Print true if variable number is positive and print false if the number is
        //not positive.
        //Note: 0 is neither a positive nor is negative

        int number=1 ;

        //when the number is grater than 0 it is positive

        boolean canResultPositive =number>0;
        boolean canResultNegative=number<0;




        System.out.println(canResultPositive);
        System.out.println(canResultNegative);
    }
}
