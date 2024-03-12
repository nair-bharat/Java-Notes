public class OverridingMain {
    public static void main(String[] args) {
        OverridingExampleA ob1 = new OverridingExampleA();
        ob1.getSum(2, 3);
        OverridingExampleB ob2 = new OverridingExampleB();
        ob2.getSum(3, 4);

        // At runtime, it is decided which function to call.
        // In Method overriding, even the argument should be the same, impl. can vary, return type should be the same.

    }
}
