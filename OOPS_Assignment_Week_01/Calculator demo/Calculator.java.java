public class Calculator {

    // attributes
    private double a;
    private double b;

    // default/null constructor
    public Calculator() {
        this.a = 20;
        this.b = 2;
    }

    // parameterized constructor
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // functions
    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double multiply() {
        return this.a * this.b;
    }

    public double divide() {
        if (this.b == 0) {
            System.out.println("Error: Number can't be divided by zero");
            return 0;
        }
        return this.a / this.b;
    }

    public double modulus() {
        if (this.b == 0) {
            System.out.println("Error: Can't find modulus with zero");
            return 0;
        }
        return this.a % this.b;
    }

    public double average() {
        return (this.a + this.b) / 2;
    }

    // display
    public void display() {
        System.out.println("CALCULATOR");
        System.out.println("1st number: " + this.a);
        System.out.println("2nd number: " + this.b);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
        System.out.println("Modulus: " + modulus());
        System.out.println("Average: " + average());
    }
}