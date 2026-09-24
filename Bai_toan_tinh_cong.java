import java.util.*;
import java.math.*;

class NhanVien{
    private String mnv, ten, chucVu;
    private double luong, cong;

    public NhanVien(String ten, double luong, double cong, String chucVu){
        this.mnv = "NV01";
        this.ten = ten;
        this.luong = luong;
        this.cong = cong;
        this.chucVu = chucVu;
    }

    public double luongThang(){
        return this.cong * this.luong;
    }

    public double thuong(){
        if(this.cong >= 25) return luongThang() * 0.2;
        else if(this.cong >= 22){
            return luongThang() * 0.1;
        }
        else return 0;
    }

    public long PhuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        else if(this.chucVu.equals("PGD")) return 200000;
        else if(this.chucVu.equals("TP")) return 180000;
        else if(this.chucVu.equals("NV")) return 150000;

        return 0;
    }

    public double getThuNhap(){
        return luongThang() + thuong() + PhuCap();
    }

    public String toString(){
        return mnv + " " + ten + " " + (long)luongThang() + " " + (long)thuong() + " " + (long)PhuCap() + " " + (long)getThuNhap();
    }
}

public class Bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NhanVien a = new NhanVien(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine());
        System.out.println(a);

    }
}
