package Homework.Homework4;

public class ArrayHomework_Task6 {
    public static void main(String[] args) {
        // You have an array of 6 int numbers and get the square
        //of each number from the array.

        int [] numbers={2,4,9,10,23,12};
        int squareofNumbers;

        for (int i = 0; i < numbers.length; i++) {
            squareofNumbers=numbers[i]*numbers[i];

            System.out.println("The Square of the given number is :"+squareofNumbers);
        }





    }
}
