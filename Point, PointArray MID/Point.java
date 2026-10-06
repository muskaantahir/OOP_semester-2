import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public Point(Point other) {
        this.x=other.x;
        this.y=other.y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }

    @Override 
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Point)) {
            return false;
        }
        Point p1 = (Point) obj;
        return this.x==p1.x && this.y==p1.y;
    }
    @Override 
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }
      @Override 
    public String toString() { 
        return ("{x:" +x +",y:" +y +"}");
    }
}