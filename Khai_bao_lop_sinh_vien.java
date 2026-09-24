import java.util.*;
import java.math.*;

class SinhVien{
    private String msv, lop, ns, ten;
    private double gpa;

    public SinhVien(String ten, String lop, String ns, Double gpa){
        this.msv = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public void chuanHoaNs(){
        String arr[] = ns.trim().split("/");
        this.ns = String.format("%02d/%02d/%04d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }

    public String toString(){
        return this.msv + " " + this.ten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", gpa);
    }
}

public class Khai_bao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        a.chuanHoaNs();

        System.out.println(a);
    }
}
