public class Main {
    public static void main(String[] args) {
        Student enggStudent = new Student(); // object creation
        enggStudent.age = 21;
        enggStudent.address = "Vasai";
        enggStudent.update_address("Borivali");
        System.out.println(enggStudent.address); // will print Borivali

        Student mbaStudent = new Student();
        // this way we are creating multiple objects of the Student class.
        // here mbaStudent is an object, which is a real world entity.
        // it has behaviour and properties

        // so here OOPs binds functions and data (gives full control)


    }
}