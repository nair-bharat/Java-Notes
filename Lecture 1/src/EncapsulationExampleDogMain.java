public class EncapsulationExampleDogMain {
    // Data Encapsulation Example
    public static void main(String[] args) {
        EncapsulationDog rottweiler = new EncapsulationDog();
        // rottweiler.color = "Black";
        // I don't want my object to directly change the data members of my class
        // System.out.println(rottweiler.getColor());

        // I want data methods to change the value and get the value
        // so I will make the data member as private.

        rottweiler.setColor("Tan");
        System.out.println(rottweiler.getColor());
        // so in this way my Dog class has full control over the members through methods.


        // Steps to achieve Encapsulation

        /*
        * 1. Declare variable of a class as private
        * 2. Provide public getters and setters to modify and view the value of the variables.
        * 3. Advantages
        *   1. Loosely coupled code
        *   2. Better access, control and security
        *
        * */

    }
}
