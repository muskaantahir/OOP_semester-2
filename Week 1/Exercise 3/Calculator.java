public class Calculator {

    // Adds all numbers passed to the method
    public double add(double... values) {

        double sum = 0;

        for (double value : values) {
            sum += value;
        }

        return sum;
    }
}