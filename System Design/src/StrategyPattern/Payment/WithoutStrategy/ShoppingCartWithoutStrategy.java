package StrategyPattern.Payment.WithoutStrategy;

public class ShoppingCartWithoutStrategy {

    private String paymentMethod;  // "CREDIT", "PAYPAL", "UPI"

    public ShoppingCartWithoutStrategy(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount) {
        if (paymentMethod.equals("CREDIT")) {
            System.out.println("Paid " + amount + " using Credit Card");
        } else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Paid " + amount + " using PayPal");
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("Paid " + amount + " using UPI");
        } else {
            System.out.println("Invalid payment method");
        }
    }

}
