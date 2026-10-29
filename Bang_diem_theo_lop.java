import java.io.*;
import java.util.*;

class MH {
    String maMH, tenMH;
    int soTC;

    public MH(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }
}

class SV {
    String msv, hoTen, lop, email;

    public SV(String msv, String hoTen, String lop, String email) {
        this.msv = msv;
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoaTen(String s) {
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}

class BangDiem {
    double diem;
    SV sv;
    MH mh;

    public BangDiem(SV sv, MH mh, double diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }

    @Override
    public String toString() {
        String diemStr = (diem == (int) diem) ? String.format("%d", (int) diem) : String.valueOf(diem);
        return sv.msv + " " + sv.hoTen + " " + mh.maMH + " " + mh.tenMH + " " + diemStr;
    }
}

public class Bang_diem_theo_lop {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        HashMap<String, SV> mapSV = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            String msv = sc1.nextLine().trim();
            String hoten = sc1.nextLine().trim();
            String lop = sc1.nextLine().trim();
            String email = sc1.nextLine().trim();
            mapSV.put(msv, new SV(msv, hoten, lop, email));
        }
        sc1.close();

        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        HashMap<String, MH> mapMH = new HashMap<>();
        int m = Integer.parseInt(sc2.nextLine().trim());

        for (int i = 1; i <= m; i++) {
            String maMH = sc2.nextLine().trim();
            String ten = sc2.nextLine().trim();
            int soTC = Integer.parseInt(sc2.nextLine().trim());
            mapMH.put(maMH, new MH(maMH, ten, soTC));
        }
        sc2.close();

        HashMap<String, ArrayList<BangDiem>> dsBD = new HashMap<>();
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int t = sc3.nextInt();

        for (int i = 1; i <= t; i++) {
            String msv = sc3.next();
            String maMH = sc3.next();
            double diem = sc3.nextDouble();

            SV a = mapSV.get(msv);
            MH b = mapMH.get(maMH);
            String lop = a.lop;

            if (!dsBD.containsKey(lop)) {
                dsBD.put(lop, new ArrayList<>());
            }
            dsBD.get(lop).add(new BangDiem(a, b, diem));
        }

        int q = sc3.nextInt();
        for (int i = 1; i <= q; i++) {
            String lop = sc3.next();

            ArrayList<BangDiem> list = dsBD.getOrDefault(lop, new ArrayList<>());
            list.sort((a, b) -> {
                int cmp = a.sv.msv.compareTo(b.sv.msv);
                if (cmp != 0) {
                    return cmp;
                }
                return a.mh.maMH.compareTo(b.mh.maMH);
            });

            System.out.println("BANG DIEM LOP " + lop + ":");
            for (BangDiem x : list) {
                System.out.println(x);
            }
        }
        sc3.close();
    }
}