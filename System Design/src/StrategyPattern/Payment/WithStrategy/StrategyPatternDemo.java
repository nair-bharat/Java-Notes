package StrategyPattern.Payment.WithStrategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012"));
        cart.checkout(2500);

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment("bharat@example.com"));
        cart.checkout(1500);

        // Switch to UPI
        cart.setPaymentStrategy(new UPIPayment("bharat@upi"));
        cart.checkout(1000);
    }

}
