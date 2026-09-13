public class TriangleMain {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(0, 7);

        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1);

    //side lenghts
        System.out.println("Side 1: " + t1.s1());
        System.out.println("Side 2: " + t1.s2());
        System.out.println("Side 3: " + t1.s3());

        System.out.println("Equilateral: " + t1.isEquilateral());
        System.out.println("Isosceles: " + t1.isIsosceles());

        //object count
        System.out.println("Object count: " + Triangle.getObjCount());
    }
}