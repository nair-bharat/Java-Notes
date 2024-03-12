public class SingleMain {
    public static void main(String[] args) {
        SingleB obj = new SingleB();
        obj.setName("Bharat");
        obj.setId(123);
        obj.getInfo(); // so here I have the method in class B as well

        SingleA objA = new SingleA();
        objA.getInfo();
    }
}
