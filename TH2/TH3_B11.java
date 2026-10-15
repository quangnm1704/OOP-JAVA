import java.util.*;
import java.io.*;

class CongNhan implements Comparable<CongNhan>{
    String ma, ten;
    int tongPhut;
    String trangthai;

    public CongNhan(String ma, String ten, String vao, String ra){
        this.ma = ma;
        this.ten = ten;
        String[] tvao = vao.split(":");
        String[] tra = ra.split(":");
        int phutVao = Integer.parseInt(tvao[0]) * 60 + Integer.parseInt(tvao[1]);
        int phutRa = Integer.parseInt(tra[0]) * 60 + Integer.parseInt(tra[1]);
        this.tongPhut = phutRa - phutVao - 60;
        this.trangthai = (this.tongPhut >= 480) ? "DU" : "THIEU";
    }

    public int compareTo(CongNhan o){
        if(this.tongPhut != o.tongPhut){
            return Integer.compare(o.tongPhut, this.tongPhut);
        }
        return this.ma.compareTo(o.ma);
    }

    public String toString(){
        int h = tongPhut / 60;
        int m = tongPhut % 60;
        return ma + " " + ten + " " + h + " " + " gio " + m + " phut "+ trangthai; 
    }
}

public class TH3_B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList <CongNhan> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            list.add(new CongNhan(ma, ten, vao, ra));
        }

        Collections.sort(list);
        for(CongNhan cn : list){
            System.out.println(cn);
        }
    }
}
