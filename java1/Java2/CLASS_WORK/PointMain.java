import java.util.*;
public class PointMain{
    public static void main(String[] args){
        
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);

        System.out.println("p1 is "+p1);
        System.out.println("Distance from origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is "+p2);
        System.out.println("Distance from origin = " + p2.distanceFromOrigin());

        p1.translate(11,6);
        p2.translate(1, 7);

        System.out.println("p1 is "+p1);
        System.out.println("p2 is "+p2);
    }// END main

    public class Point{
        private int x;
        private int y;

        // Constructors
        
        public Point() {
            this(0,0);
        }

        public Point(int x, int y) {
            setLocation(x,y);
        }

        public double distanceFromOrigin() {
            return Math.sqrt(x*x+y*y);
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        
        public void setLocation(int x, int y){
            this.x = x;
            this.y = y;
        }

        public String toString(){
            return "("+x+", "+y+")";
        }

        public void translate(int dx, int dy){
            setLocation(x+dx, y+dy);
        }

    }
}
