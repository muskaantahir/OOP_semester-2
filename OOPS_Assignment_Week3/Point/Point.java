public class Point {
    private double x;
    private double y;

//default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //addition of points
    public Point addition(Point p) {
       double newX=this.x + p.x;
       double newY=this.y + p.y;
        return new Point(newX,newY);
    }

    //subtraction 
    public Point subtraction(Point p) {
        double newY=this.y - p.y;
        double newX=this.x - p.x;
        return new Point(newX,newY);
    }

//distance between two points
    public double length(Point obj){
        double length = Math.sqrt(Math.pow((obj.x - this.x),2) + Math.pow((obj.y - this.y), 2));
        return length;
   }

    //toString
     public String toString(){
        return "(" + this.x + ", " + this.y + ")";
   }
}