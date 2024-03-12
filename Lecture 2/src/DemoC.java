public class DemoC implements DemoA, DemoB{

    @Override
    public void getEngine() {
        int x = 2;
        System.out.println("Engine is printed here "+x);
    }

    // Whichever class implements has the responsibility to implement the method.

}
