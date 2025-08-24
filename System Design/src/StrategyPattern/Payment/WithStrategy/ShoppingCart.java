package StrategyPattern.Payment.WithStrategy;

// Context
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    // set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method!");
        } else {
            paymentStrategy.pay(amount);
        }
    }

}
