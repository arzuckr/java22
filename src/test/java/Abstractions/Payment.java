package Abstractions;

public abstract class Payment {
     String payerName;

     public  Payment(String payerName){
         this.payerName = payerName;


     }

     // Abstract method to be implemented by subclasses
       abstract void processPayment(double amount);

     //We could create a concrete method as well
        void transactionDetails(double amount){
            System.out.println("Transaction details: ");
            System.out.println("Payer : "+ payerName);
            System.out.println("Amount: "+ amount);
        }
}
