package SalesDepartment;

public class Analytics {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        // invoice.getProfitStatements(); - won't be able to access within same package as well.

        invoice.getAdditionalDetails(); // able to access protected method - same package

        invoice.getMiscData(); // able to access - Default access specifier
    }

}
