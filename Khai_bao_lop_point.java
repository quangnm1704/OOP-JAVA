import java.util.*;
import java.math.*;

class point{
    private double x;
    private double y;

    public point(double x, double y){
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

public class Khai_bao_lop_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());

        while(q-- > 0){
            point a = new point(sc.nextDouble(), sc.nextDouble());
            point b = new point(sc.nextDouble(), sc.nextDouble());
            
            double dis = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
            System.out.printf("%.4f", dis);
            System.out.println();
        
        }

    }
}
