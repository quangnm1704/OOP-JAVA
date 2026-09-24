import java.util.*;
import java.math.*;

class HCN{
	private long dai, rong, ChuVi, DienTich;
	private String color;
	
	public HCN(long dai, long rong, String color) {
		this.dai = dai;
		this.rong = rong;
		this.color = color;
	}
	
	public String ChuanHoa() {
		this.color = this.color.toLowerCase();
		this.color = Character.toUpperCase(this.color.charAt(0)) + this.color.substring(1);
		
		return this.color;
	}
	
	public void ChuVi() {
		this.ChuVi = (this.dai + this.rong) * 2;
	}
	
	public void DienTich() {
		this.DienTich = this.dai * this.rong;
	}
	
	public String toString() {
		return this.ChuVi + " " + this.DienTich + " "+ this.color;
	}
	
	public long getDai() {
		return this.dai;
	}
	
	public long getRong() {
		return this.rong;
	}
}


public class Khai_bao_lop_HCN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long dai, rong;
		String color;
		dai = sc.nextLong();
		rong = sc.nextLong();
		color = sc.next();

		HCN a = new HCN(dai, rong, color);

		if(a.getDai() <= 0 || a.getRong() <= 0) System.out.println("INVALID");
		else {
			a.ChuanHoa();
			a.ChuVi();
			a.DienTich();
			
			System.out.println(a);
		}

	}

}
