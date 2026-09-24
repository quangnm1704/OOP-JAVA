import java.util.*;
import java.io.*;

class SV{
    public String ten, lop, ns, msv;
    public Double gpa;

    public SV(String ten, String lop, String ns, Double gpa){
        this.ten = chuanHoaTen(ten);
        this.lop = lop;
        this.ns = chuanHoaNS(ns);
        this.gpa = gpa;
    }

    private String chuanHoaTen(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

    private String chuanHoaNS(String s){
        String[] arr = s.split("/");
        String ns = String.format("%02d/%02d/%04d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));

        return ns.toString();
    }

    public String toString(){
        return this.msv + " " + this.ten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", this.gpa);
    }
}

public class Chuan_hoa_danh_sach_SV {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        sc.nextLine();

        SV[] a = new SV[n];
        for(int i = 0; i < n; i++){
            a[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            a[i].msv = String.format("B20DCCN%03d", i+1);
        }

        for(SV x : a) System.out.println(x);

    }
}
