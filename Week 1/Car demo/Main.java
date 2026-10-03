public class Main {
    public static void main(String[] args) {

        // object created using default constructor
        Car supra = new Car();

        // object created using parameterized constructor
        Car bmw = new Car("BMW", "Black", 0, false);

        // Car 1
        System.out.println("Car 01");
        bmw.startEngine();
        bmw.accelerate();
        bmw.accelerate();
        bmw.brake();
        bmw.displayState();
        bmw.stopEngine();
        bmw.displayState();

        // Car 2
        System.out.println("Car 02");
        supra.startEngine();
        supra.accelerate();
        supra.brake();
        supra.displayState();
        supra.stopEngine();
        supra.displayState();
    }
}