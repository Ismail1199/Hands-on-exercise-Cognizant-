package DesignPatternsAndPrinciples.Exercise4;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor payPal = new PayPalAdapter();
        payPal.processPayment(2500);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(5000);

    }

}