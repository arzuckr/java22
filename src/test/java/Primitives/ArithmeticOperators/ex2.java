package Primitives.ArithmeticOperators;

public class ex2 {
    public static void main(String[] args) {
        int el=8,tig=12,par=24;
        int foodEl=50,foodTig=20,foodPar=2;
        int totalAmount=(8*50)+(12*20)+(24*2);
        System.out.println("Total Amount of Food Consumed Daily by All Animals: "+totalAmount);
        int monthly=totalAmount*30;
        System.out.println("Total Amount of Food Consumed Monthly by All Animals: "+monthly);

         int yearly = monthly*12;
        System.out.println("Total Amount of Food Consumed Yearly by All Animals: "+yearly);




    }
}
