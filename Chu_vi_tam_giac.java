import java.util.*;
import java.math.*;

class point{
    private double x, y;

    public point(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}

public class Chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int q = sc.nextInt();
            while(q-- > 0){
                        point a = new point(sc.nextDouble(), sc.nextDouble());
            point b = new point(sc.nextDouble(), sc.nextDouble());
            point c = new point(sc.nextDouble(), sc.nextDouble());

            double d1 = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
            double d2 = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
            double d3 = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));

            if(d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1){
                System.out.printf("%.3f", d1 + d2 + d3);
                System.out.println();
            }

            else{
                System.out.println("INVALID");
            }
        }
    }
}
