package Abstractions;

public class PaymentTest {
    public static void main(String[] args) {

    //Can I create an object out of payment class . No

        Payment payment1 = new CreditCardPayment("Jane ", "12345");

        payment1.processPayment(41.7);//this will

        Payment payment2 = new PayPalPayment("Any ", "test@qa.com");
        payment2.processPayment(36.9);
    }
}
