public class Car {

    // attributes
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;

    // default/null constructor
    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
    }

    // parameterized constructor
      public Car(String brand, String color, int speed, boolean engineOn) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
      }

    // functions
    public void startEngine() {
        this.engineOn = true;
        System.out.println(brand + " engine started");
    }

    public void stopEngine() {
        speed = 0;
        engineOn = false;
        System.out.println(brand + " engine stopped");
    }

    public void accelerate() {
        if (engineOn) {
            speed += 20;
            System.out.println(brand + " accelerated");
        } else {
            System.out.println("start the engine first");
        }
    }

    public void brake() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }

        System.out.println(brand + " slowed down");
    }

    // display
    public void displayState() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Engine: " + engineOn);
        System.out.println();
    }

}