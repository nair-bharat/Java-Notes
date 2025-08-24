package StrategyPattern.Payment.WithoutStrategy;

public class WithoutStrategyDemo {

    public static void main(String[] args) {
        ShoppingCartWithoutStrategy cart1 = new ShoppingCartWithoutStrategy("CREDIT");
        cart1.checkout(2500);

        ShoppingCartWithoutStrategy cart2 = new ShoppingCartWithoutStrategy("PAYPAL");
        cart2.checkout(1500);

        ShoppingCartWithoutStrategy cart3 = new ShoppingCartWithoutStrategy("UPI");
        cart3.checkout(1000);
    }
}
