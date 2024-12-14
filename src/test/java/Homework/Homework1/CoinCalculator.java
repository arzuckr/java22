package Homework.Homework1;

public class CoinCalculator {
    public static void main(String[] args) {
        double quarterToDollar=0.25;
        double dimesToDollar=0.10;
        double nickelToDollar=0.05;
        double pennyToDollar=0.01;

        int totalQuarters=5,totalDimes=4,totalNickels=3,totalPennies=2;
        double amountOfQuarters=(quarterToDollar*totalQuarters);
        System.out.println(amountOfQuarters);

        double amountOfDimes= (dimesToDollar*totalDimes);
        System.out.println(amountOfDimes);

        double amountOfNickels=(nickelToDollar*totalNickels);
        System.out.println(amountOfNickels);

        double amountOfPennies=(pennyToDollar*totalPennies);
        System.out.println(amountOfPennies);

        double expectedOutput=amountOfQuarters+amountOfDimes+amountOfNickels+amountOfPennies;
        System.out.println(expectedOutput);


    }
}
