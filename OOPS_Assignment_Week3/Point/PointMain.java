public class PointMain {
    public static void main(String[] args) {
        Point x = new Point(4, 7);
        Point y = new Point(11, 2);

        Point addition = x.addition(y);
        Point subtraction = x.subtraction(y);
        double distance = x.length(y);

        System.out.println("Addition of points is: " + addition);
        System.out.println("Subtraction of points is: " + subtraction);
        System.out.println("Distance between points is: " + distance);
        System.out.println(x);
        System.out.println(y);
    }
}