public class Car implements Cloneable {
    private String model;
    private Driver driver;
    private int[] speedHistory;

    public Car(String model, String driverName, int driverId){
        this.model=model;

        //driver is constructed internally
        this.driver = new Driver(driverName, driverId);

        this.speedHistory = new int [2]; //given in hint
    }
    public void drive() {
        this.speedHistory[0] = 0;
    }
    public void drive(int speed) {
        this.speedHistory[1] = speed;
    }
    public void setSpeed(int index, int speed) {
      this.speedHistory[index] = speed;
    }
    public int getSpeed(int index) {
        return this.speedHistory[index];
    }
     
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();   //shallow copy
    }                   

    public Car deepCopy() throws CloneNotSupportedException {
    Car c1 = (Car) super.clone();
    c1.model = model;
    c1.driver = new Driver(driver);
    c1.speedHistory = speedHistory.clone();
    return c1;
    }
    @Override 
    public String toString() {
        return "Car: {model: " +model +"Driver: " +driver + "speedHistory(" +speedHistory[0]+"," +speedHistory[1] +")}";
    }
}