public class Demo {
    int x = 20;
    private static int sum(int a, int b) {
        // x++; Non-static field 'x' cannot be referenced from a static context
        int total = a + b;
        return total;
        // does not modify the state of object, works on data which does not affect
    }
    private int sum2(int a, int b) {
        x++; // Possible
        return 0;
    }
    private int sum3(int a, int b) {
        int t = a + b;
        x = x + t;
        return x;
    }

    public static void main(String[] args) {
        Demo demo =new Demo();
        System.out.println(demo.x);
        // Demo.sum(x, 10);
        // Non-static field 'x' cannot be referenced from a static context
    }
}
