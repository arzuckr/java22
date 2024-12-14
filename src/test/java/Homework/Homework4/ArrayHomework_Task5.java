package Homework.Homework4;

public class ArrayHomework_Task5 {
    public static void main(String[] args) {
        double [] degree={90,85,74,89,100,102};
        double fahrenheit;
        for (int i = 0; i < degree.length ; i++) {
            fahrenheit=  ((degree[i] - 32) * 5) /9;
            System.out.println("Converted weather is :"  + fahrenheit+ " C" );

        }

    }
}
