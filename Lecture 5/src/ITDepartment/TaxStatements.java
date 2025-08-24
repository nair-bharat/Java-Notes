package ITDepartment;

public class TaxStatements {
    private float calculateRate(String monitor, int price, float taxRate) {
        return taxRate * 2.5f + price;
    }

    private float calculateRate(String monitor, int price, float taxRate, float gst) {
        return taxRate * 2.5f + price + gst;
    }

    // both the above methods are example of method overloading in Java

}
