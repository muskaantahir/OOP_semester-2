public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private static int count = 0;

    //default constructor
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        count++;
    }

    //parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        count++;
    }

    //copy constructor
    public Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
        count++;
    }

    public Point getP1() {
        return new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public Point getP3() {
        return new Point(p3);
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void setP3(Point p3) {
        this.p3 = new Point(p3);
    }

    public double s1() {
        return p1.length(p2);
    }

    public double s2() {
        return p2.length(p3);
    }

    public double s3() {
        return p3.length(p1);
    }

    public boolean isEquilateral() {
        double a = s1();
        double b = s2();
        double c = s3();
        return a == b && b == c;
    }

    public boolean isIsosceles() {
        double a = s1();
        double b = s2();
        double c = s3();
        return a == b || b == c || a == c;
    }

    public static int getObjCount() {
        return count;
    }

    public String toString() {
        return "Triangle: " + p1 + ", " + p2 + ", " + p3;
    }
}