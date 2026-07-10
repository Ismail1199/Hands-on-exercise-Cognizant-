package DesignPatternsAndPrinciples.Exercise8;

public class Main {

    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext(new CreditCardPayment());

        payment.executePayment(2500);

        payment.setPaymentStrategy(new PayPalPayment());

        payment.executePayment(1500);

    }
}