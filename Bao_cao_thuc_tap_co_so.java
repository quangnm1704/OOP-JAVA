// import java.io.*;
// import java.util.*;

// class SinhVien {
//     String ma, ten;

//     public SinhVien(String ma, String ten) {
//         this.ma = ma;
//         this.ten = ten;
//     }
// }

// class DeTai {
//     String tenGV, tenDeTai;

//     public DeTai(String tenGV, String tenDeTai) {
//         this.tenGV = tenGV;
//         this.tenDeTai = tenDeTai;
//     }
// }

// class BaoCao implements Comparable<BaoCao> {
//     String maSV, tenSV, tenDeTai, tenGV;

//     public BaoCao(String maSV, String tenSV, String tenDeTai, String tenGV) {
//         this.maSV = maSV;
//         this.tenSV = tenSV;
//         this.tenDeTai = tenDeTai;
//         this.tenGV = tenGV;
//     }

//     public int compareTo(BaoCao o) {
//         return this.maSV.compareTo(o.maSV);
//     }

//     public String toString() {
//         return maSV + " " + tenSV + " " + tenDeTai + " " + tenGV;
//     }
// }

// public class Bao_cao_thuc_tap_co_so {
//     public static void main(String[] args) throws Exception {
//         Scanner scSV = new Scanner(new File("SINHVIEN.in"));
//         int n = Integer.parseInt(scSV.nextLine().trim());
//         Map<String, SinhVien> mapSV = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             String ma = scSV.nextLine().trim();
//             String ten = scSV.nextLine().trim();
//             scSV.nextLine();
//             scSV.nextLine();
//             mapSV.put(ma, new SinhVien(ma, ten));
//         }
//         scSV.close();

//         Scanner scDT = new Scanner(new File("DETAI.in"));
//         int m = Integer.parseInt(scDT.nextLine().trim());
//         Map<String, DeTai> mapDT = new HashMap<>();
        
//         for (int i = 1; i <= m; i++) {
//             String tenGV = scDT.nextLine().trim();
//             String tenDeTai = scDT.nextLine().trim();
//             String maDT = String.format("DT%03d", i);
//             mapDT.put(maDT, new DeTai(tenGV, tenDeTai));
//         }
//         scDT.close();

//         Scanner scHD = new Scanner(new File("HOIDONG.in"));
//         int k = scHD.nextInt();
//         ArrayList<BaoCao>[] dsHD = new ArrayList[9];
//         for (int i = 1; i <= 8; i++) {
//             dsHD[i] = new ArrayList<>();
//         }

//         for (int i = 0; i < k; i++) {
//             String maSV = scHD.next();
//             String maDT = scHD.next();
//             String maHD = scHD.next();
//             int hdId = Integer.parseInt(maHD.substring(2));
//             SinhVien sv = mapSV.get(maSV);
//             DeTai dt = mapDT.get(maDT);
//             dsHD[hdId].add(new BaoCao(sv.ma, sv.ten, dt.tenDeTai, dt.tenGV));
//         }
//         scHD.close();

//         for (int i = 1; i <= 8; i++) {
//             if (!dsHD[i].isEmpty()) {
//                 System.out.println("DANH SACH HOI DONG " + i + ":");
//                 Collections.sort(dsHD[i]);
//                 for (BaoCao bc : dsHD[i]) {
//                     System.out.println(bc);
//                 }
//             }
//         }
//     }
// }


import java.util.*;
import java.io.*;

class SV{
    String msv;
    String hoTen;
    String sdt;
    String email;

    public SV(String msv, String hoTen, String sdt, String email){
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }
}

class DT{
    String tenGV;
    String tenDT;
    String maDT;

    public DT(String maDT, String tenGV, String tenDT){
        this.tenGV = tenGV;
        this.tenDT = tenDT;
        this.maDT = maDT;
    }
}

class HD{
    String msv;
    String maDT;
    String maHD;
    SV sv;
    DT dt;

    public HD(String maHD, SV sv, DT dt){
        this.msv = msv;
        this.maDT = maDT;
        this.maHD = maHD;
        this.sv = sv;
        this.dt = dt;
    }

    public String toString(){
        return sv.msv + ' ' + sv.hoTen + " " + dt.tenDT + " " + dt.tenGV;
    }

}

public class Bao_cao_thuc_tap_co_so{
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.nextLine());
        HashMap <String, SV> mapSV = new HashMap<>();

        for(int i = 1; i <= n; i++){
            String msv = sc1.nextLine();
            String hoTen = sc1.nextLine();
            String sdt = sc1.nextLine();
            String email = sc1.nextLine();
            
            mapSV.put(msv, new SV(msv, hoTen, sdt, email));
        }
        sc1.close();

        Scanner sc2 = new Scanner(new File("DETAI.in"));
        int m = Integer.parseInt(sc2.nextLine());
        HashMap <String, DT> mapDT = new HashMap<>();

        for(int i = 1; i <= m; i++){
            String maDT = String.format("DT%03d", i);
            String tenGV = sc2.nextLine();
            String tenDT = sc2.nextLine();

            mapDT.put(maDT, new DT(maDT, tenGV, tenDT));
        }
        sc2.close();

        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        int q = Integer.parseInt(sc3.nextLine());
        List <HD> listHD = new ArrayList<>();
        List <HD>[] dsHD = new ArrayList[9];

        for(int i = 1; i <= 8; i++){
            dsHD[i] = new ArrayList<>();
        }

        for(int i = 1; i <= q; i++){
            String msv = sc3.next();
            String maDT = sc3.next();
            String maHD = sc3.next();
            HD hd = new HD(maHD, mapSV.get(msv), mapDT.get(maDT));
            listHD.add(hd);
            int thuTuHD = Integer.parseInt(maHD.substring(2));
            dsHD[thuTuHD].add(hd);
        }

        for(int i = 1; i <= 8; i++){
            dsHD[i].sort((x, y) ->{
                return x.sv.msv.compareTo(y.sv.msv);
            });
        }

        for(int i = 1; i <= 8; i++){
            if(!dsHD[i].isEmpty()){
                System.out.println("DANH SACH HOI DONG " + i + ": ");
                for(HD x : dsHD[i]){
                    System.out.println(x);
                }
            }
        }

    }
}