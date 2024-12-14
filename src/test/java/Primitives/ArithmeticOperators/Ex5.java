package Primitives.ArithmeticOperators;

public class Ex5 {

        //Create an integer variable and regardless of the value
        //your code should print the last digit of that number
        public static void main(String[] args) {
          int number = 450785;

            // finding a remainder with 10 will give us the last
            //digit from a number.

            int lastDigit=number %10;


            System.out.println("the last digit of the number is "+lastDigit);

            //Create an integer variable and regardless of the value
            //your code should print times 2 of that number
            int Double = number*2;
            System.out.println("Result: "+ Double);




        }
}
