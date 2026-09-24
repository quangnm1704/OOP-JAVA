import java.util.*;
import java.math.*;

class Points{
	private double x;
	private double y;
	
	public Points(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
}

public class J04010_Dien_tich_hinh_tron_ngoai_tiep_tam_giac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		while(q-- > 0) {
			Points a = new Points(sc.nextDouble(), sc.nextDouble());
			Points b = new Points(sc.nextDouble(), sc.nextDouble());
			Points c = new Points(sc.nextDouble(), sc.nextDouble());
			
	        double d1 = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	        double d2 = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
	        double d3 = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
	        
	        if(d1 <= 0 || d2 <= 0 || d3 <= 0 || d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
	        	System.out.println("INVALID");
	        }
	        
	        else {
	        	double s = (double)1/4 * Math.sqrt((d1 + d2 + d3)*(d1 + d2 - d3)*(-d1 + d2 + d3)*(d1 - d2 + d3));
	        	double r = (d1*d2*d3) / (4*s);
	        	double DienTich = Math.pow(r, 2) * Math.PI;
	        	
	        	System.out.printf("%.3f", DienTich);
				System.out.println();
	        }

		}
	}

}
