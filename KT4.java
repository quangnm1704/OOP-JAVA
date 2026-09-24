import java.util.*;
import java.math.*;


class SinhVien{
    private String ma;
    private String ten;
    private String lop;
    private String ns;
    private double gpa;

    public SinhVien(String ten, String lop, String ns, double gpa){
       this.ma = "B20DCCN001";
       this.ten = ten;
       this.lop = lop;
       this.gpa = gpa;

       StringBuilder sb = new StringBuilder(ns);
       if(sb.charAt(1) == '/'){
        sb.insert(0, "0");
       }

       if(sb.charAt(4) == '/'){
        sb.insert(3, "0");
       }

       this.ns = sb.toString();
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", this.gpa);
    }

}

public class KT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println(s);

    }
}
