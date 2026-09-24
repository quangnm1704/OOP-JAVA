import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien> {
    private String ma;
    private String hoTen;
    private String sdt;
    private String email;
    private String ho;
    private String dem;
    private String ten;

    public SinhVien(String ma, String hoTen, String sdt, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;

        String[] parts = hoTen.trim().split("\\s+");
        this.ten = parts[parts.length - 1];
        this.ho = parts[0];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            sb.append(parts[i]).append(" ");
        }
        this.dem = sb.toString().trim();
    }

    public int compareTo(SinhVien o) {
        if (!this.ten.equals(o.ten)) {
            return this.ten.compareTo(o.ten);
        }
        if (!this.ho.equals(o.ho)) {
            return this.ho.compareTo(o.ho);
        }
        if (!this.dem.equals(o.dem)) {
            return this.dem.compareTo(o.dem);
        }
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + sdt + " " + email;
    }
}

public class KT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            list.add(new SinhVien(ma, hoTen, sdt, email));
        }

        Collections.sort(list);

        for (SinhVien sv : list) {
            System.out.println(sv);
        }

        sc.close();
    }
}