public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.add(12, 18));

        System.out.println("Sum: " + calculator.add(4, 8, 12, 16));

        System.out.println("Sum: " + calculator.add(2.5, 7.5, 10));
    }
}