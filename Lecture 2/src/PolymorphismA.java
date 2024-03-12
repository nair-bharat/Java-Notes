public class PolymorphismA {
    public static void main(String[] args) {
        Sum ob = new Sum();
        System.out.println(ob.doSum(2, 3));

        // Why this is known as compile time / static polymorphism / Method overloading
        /*
        *  Because at compile time, Java knows which method to call
        * */


    }
}
