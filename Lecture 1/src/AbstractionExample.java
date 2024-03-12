interface Car {
    public void applyBrake();
}

class CarImpl implements Car {
    Boolean brake;

    void setBrake(Boolean value) {
        this.brake = value;
    }

    @Override
    public void applyBrake() {
        this.setBrake(true);
        System.out.println("Brakes applied");
    }

    public void startCar() {
        this.setBrake(false);
    }
}



public class AbstractionExample {
    public static void main(String[] args) {
        // CarImpl c1 = new CarImpl(); // the issue here is we are exposing lot of details to the client
        // c1.applyBrake();
        // c1 is having access to internal functions like getters and setters here
        
        Car car = new CarImpl();
        car.applyBrake();
    }
}
