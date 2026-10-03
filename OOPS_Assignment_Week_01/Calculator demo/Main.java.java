public class Main {
    public static void main(String[] args) {

        // Normal case
        Calculator calc1 = new Calculator(20, 5);
        calc1.display();

        System.out.println();

        // Edge case (division by zero)
        Calculator calc2 = new Calculator(20, 0);
        calc2.display();
    }
}