public class PointArray implements Cloneable {
    private Point[] points;

    public PointArray(Point[] points) {
        this.points=points;
    }
    public Point getPoint(int index) {
        return points[index];
    }
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray) super.clone();
    }
    public PointArray deepCopy() throws CloneNotSupportedException {
        PointArray p1 = (PointArray) super.clone();
        
        p1.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            p1.points[i] = new Point(points[i]);
        }
        return p1;
    }
}