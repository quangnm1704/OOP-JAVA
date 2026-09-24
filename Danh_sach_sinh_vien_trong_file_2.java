import java.io.*;
import java.util.*;

class SV{
    public String hoten, lop, ns, msv;
    public Double gpa;

    public SV(String msv, String hoten, String lop, String ns, Double gpa){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.ns = Chuanhoa(ns);
        this.gpa = gpa;
    }

    private String Chuanhoa(String s){
        String[] a = s.trim().split("/");

        String res = String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
        return res.toString().trim();
    }

    public String toString(){
        return this.msv + " " + this.hoten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", this.gpa);
    }
}

public class Danh_sach_sinh_vien_trong_file_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));

        int n = Integer.parseInt(sc.nextLine());

        SV[] a = new SV[n];
        for(int i = 0; i < n; i++){
            String msv = String.format("B20DCCN%03d", i+1);
            a[i] = new SV(msv, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }

        for(SV x : a) System.out.println(x);

    }
}
