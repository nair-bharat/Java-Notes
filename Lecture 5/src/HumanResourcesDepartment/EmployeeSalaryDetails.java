package HumanResourcesDepartment;

import SalesDepartment.Invoice;

public class EmployeeSalaryDetails {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.getInvoice(); // we can access this method

        // invoice.getProfitStatements() - we won't be able to access this method
    }
}
