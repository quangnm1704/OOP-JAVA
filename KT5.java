import java.util.*;
import java.math.*;


class SinhVien implements Comparable <SinhVien> {
    private String ma;
    private String ten;
    private String gt;
    private String lop;
    private String email;
    private String sdt;

    public SinhVien(String ma, String ten, String gt, String lop, String email, String sdt){
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getLop(){
        return lop;
    }

    public int compareTo(SinhVien o){
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }

        return this.ma.compareTo(o.ma);
    }

    public String toString(){
        return ma + ", " + ten + ", " + gt + ", " + lop + ", " + email + ", " + sdt;
    }

};

public class KT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> list = new ArrayList<>();


        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            list.add(new SinhVien(ma, ten, gt, lop, email, sdt));
        }

        String lop = sc.nextLine();
        ArrayList <SinhVien> res = new ArrayList<>();

        for(SinhVien x : list){
            if(x.getLop().equals(lop)) res.add(x);
        }

        if(res.isEmpty()) System.out.println("N/A");
        else{

            Collections.sort(res);
            for(SinhVien x : res) System.out.println(x);
        }
    }
}
