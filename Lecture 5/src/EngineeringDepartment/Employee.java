package EngineeringDepartment;

import SalesDepartment.Invoice;

public class Employee extends Invoice {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getAdditionalDetails(); // subclasses in different classes able to access
        // e.getMiscData(); - not able to access this data
    }
}
