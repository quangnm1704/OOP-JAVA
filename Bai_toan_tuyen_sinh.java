import java.util.*;
import java.text.DecimalFormat;

class TuyenSinh{
	private String Ma, HoTen, TrangThai;
	private double toan, ly, hoa, DiemUuTien, Tong;
	
	public TuyenSinh(String Ma, String ten, double toan, double ly, double hoa) {
		this.Ma = Ma;
		this.HoTen = ten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	
	public void UuTien() {
		if(Ma.substring(0, 3).equals("KV1")) DiemUuTien = 0.5;
		else if(Ma.substring(0, 3).equals("KV2")) DiemUuTien = 1;
		else DiemUuTien = 2.5;
	}
	
	public void TongDiem() {
		Tong = toan*2 + ly + hoa;
	}
	
	public void setTrangThai() {
		if(Tong + DiemUuTien >= 24) TrangThai = "TRUNG TUYEN";
		else TrangThai = "TRUOT";
	}

	private String formatNumber(double num) {
			DecimalFormat df = new DecimalFormat("#.#");
			return df.format(num);
		}

	public String toString() {
		return this.Ma  + " " + this.HoTen + " " + formatNumber(this.DiemUuTien) + " " + formatNumber(this.Tong) + " " + this.TrangThai;
	}
	
}

public class Bai_toan_tuyen_sinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TuyenSinh a = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
		a.UuTien();
		a.TongDiem();
		a.setTrangThai();
		System.out.println(a);
		
	}

}
