import java.util.*;
import java.io.*;

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Polygon{
    private Point[] p;
    public Polygon(Point[] p){
        this.p = p;
    }

    public String getArea(){
        long sum = 0;
        int n = p.length;
        for(int i = 0; i < n; i++){
            int j = (i+1) % n;
            sum += (long) p[i].x * p[j].y - (long) p[j].x * p[i].y;
        }

        double area = Math.abs(sum) / 2.0;
        return String.format("%.3f", area);
    }
}

public class TH3_B8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();

        while(t-- > 0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(), in.nextInt());
            }

            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
