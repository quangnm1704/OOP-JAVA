// import java.io.*;
// import java.util.*;

// class KhachHang {
//     String ma, ten, diaChi;

//     public KhachHang(String ma, String ten, String diaChi) {
//         this.ma = ma;
//         this.ten = ten;
//         this.diaChi = diaChi;
//     }
// }

// class MatHang {
//     String ma, ten, donVi;
//     long giaMua, giaBan;

//     public MatHang(String ma, String ten, String donVi, long giaMua, long giaBan) {
//         this.ma = ma;
//         this.ten = ten;
//         this.donVi = donVi;
//         this.giaMua = giaMua;
//         this.giaBan = giaBan;
//     }
// }

// class HoaDon {
//     String maHD;
//     KhachHang kh;
//     MatHang mh;
//     int soLuong;
//     long thanhTien;

//     public HoaDon(int id, KhachHang kh, MatHang mh, int soLuong) {
//         this.maHD = String.format("HD%03d", id);
//         this.kh = kh;
//         this.mh = mh;
//         this.soLuong = soLuong;
//         this.thanhTien = mh.giaBan * soLuong;
//     }

//     public String toString() {
//         return maHD + " " + kh.ten + " " + kh.diaChi + " " + mh.ten + " " + mh.donVi + " " + mh.giaMua + " " + mh.giaBan + " " + soLuong + " " + thanhTien;
//     }
// }

// public class Bai_toan_ban_hang {
//     public static void main(String[] args) throws Exception {
//         Scanner scKH = new Scanner(new File("KH.in"));
//         int n = Integer.parseInt(scKH.nextLine().trim());
//         Map<String, KhachHang> mapKH = new HashMap<>();
//         for (int i = 1; i <= n; i++) {
//             String ten = scKH.nextLine().trim();
//             String gioiTinh = scKH.nextLine().trim();
//             String ngaySinh = scKH.nextLine().trim();
//             String diaChi = scKH.nextLine().trim();
//             String ma = String.format("KH%03d", i);
//             mapKH.put(ma, new KhachHang(ma, ten, diaChi));
//         }
//         scKH.close();

//         Scanner scMH = new Scanner(new File("MH.in"));
//         int m = Integer.parseInt(scMH.nextLine().trim());
//         Map<String, MatHang> mapMH = new HashMap<>();
//         for (int i = 1; i <= m; i++) {
//             String ten = scMH.nextLine().trim();
//             String donVi = scMH.nextLine().trim();
//             long giaMua = Long.parseLong(scMH.nextLine().trim());
//             long giaBan = Long.parseLong(scMH.nextLine().trim());
//             String ma = String.format("MH%03d", i);
//             mapMH.put(ma, new MatHang(ma, ten, donVi, giaMua, giaBan));
//         }
//         scMH.close();

//         Scanner scHD = new Scanner(new File("HD.in"));
//         int k = scHD.nextInt();
//         for (int i = 1; i <= k; i++) {
//             String maKH = scHD.next();
//             String maMH = scHD.next();
//             int soLuong = scHD.nextInt();
//             HoaDon hd = new HoaDon(i, mapKH.get(maKH), mapMH.get(maMH), soLuong);
//             System.out.println(hd);
//         }
//         scHD.close();
//     }
// }

import java.util.*;
import java.io.*;

class KH{
    String maKH;
    String tenKH;
    String gt;
    String ns;
    String dc;

    public KH( String maKH, String tenKH, String gt,  String ns, String dc){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }    
}

class MH{
    String maMH;
    String tenMH;
    String donVi;
    int giaMua;
    int giaBan;

    public MH(String maMH, String tenMH, String donVi, int giaMua, int giaBan){
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
}

class HD{
    String maHD;
    KH khachHang;
    MH matHang;
    int soLuong;
    long thanhTien;


    public HD(String maHD, KH khachHang, MH matHang, int soLuong){
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = matHang.giaBan * soLuong;
    }

    public String toString(){
        return this.maHD + " " + khachHang.tenKH + " " + khachHang.dc + " " + matHang.tenMH + " " + matHang.donVi + 
        " " + matHang.giaMua + " " + matHang.giaBan + " " + this.soLuong + " " + this.thanhTien;
    }

}

public class Bai_toan_ban_hang{
    public static void main(String[] args) throws Exception {
        Scanner scKH = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(scKH.nextLine());

        HashMap <String, KH> mapKH = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String maKH = String.format("KH%03d", i);
            String tenKH = scKH.nextLine();
            String gtKH = scKH.nextLine();
            String nsKH = scKH.nextLine();
            String dcKH = scKH.nextLine();
            mapKH.put(maKH, new KH(maKH, tenKH, gtKH, nsKH, dcKH));
        }
        scKH.close();

        Scanner scMH = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(scMH.nextLine());
        HashMap <String, MH> mapMH = new HashMap<>();

        for(int i = 1; i <= m; i++){
            String maMH = String.format("MH%03d", i);
            String tenMH = scMH.nextLine();
            String donVi = scMH.nextLine();
            int giaMua = Integer.parseInt(scMH.nextLine());
            int giaBan = Integer.parseInt(scMH.nextLine());

            mapMH.put(maMH, new MH(maMH, tenMH, donVi, giaMua, giaBan));
        }
        scMH.close();

        Scanner scHD = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(scHD.nextLine());
        List <HD> listHD = new ArrayList<>();
        
        for(int i = 1; i <= k; i++){
            String maKH = scHD.next();
            String maMH = scHD.next();
            int soLuong = scHD.nextInt();

            String maHD = String.format("HD%03d", i);
            KH a = mapKH.get(maKH);
            MH b = mapMH.get(maMH);
            HD hoaDon = new HD(maHD, a, b, soLuong);
            listHD.add(hoaDon);
            System.out.println(hoaDon);

        }
        scHD.close();

    }
}