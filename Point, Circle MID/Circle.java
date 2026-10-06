public class Circle implements Cloneable {
    private String label;
    private Point[] points;

    public Circle(String label, Point[] source) {
        this.label=label;
        this.points = new Point[source.length];
        for(int i=0;i<source.length;i++) {
            this.points[i] = new Point(source[i]);
        }
    }
    public Point getPoint(int index) {
        return points[index];
    }
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
    public Circle deepCopy() throws CloneNotSupportedException {
        Circle c1 = (Circle) super.clone();
        c1.label = this.label;
        
        c1.points = new Point[this.points.length];

        for (int i = 0; i < this.points.length; i++) {  //deepCopy() must create a new Point for every element.
         c1.points[i] = new Point(this.points[i]);
            }
        return c1;
    }
    @Override 
    public String toString() {
    return "{" +label + ": " + points[0] + ", " + points[1] + ", " + points[2] +"}";
    }
}