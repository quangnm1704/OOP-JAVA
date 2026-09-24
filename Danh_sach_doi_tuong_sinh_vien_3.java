
import java.util.*;

class SV {
    String msv, ten, lop, ns;
    double gpa;

    public SV(int id, String ten, String lop, String ns, double gpa) {
        this.msv = String.format("B20DCCN%03d", id);
        this.ten = chuanHoaTen(ten);
        this.lop = lop.trim();
        this.ns = chuanHoaNS(ns);
        this.gpa = gpa;
    }

    private String chuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
              .append(w.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaNS(String s) {
        String[] arr = s.trim().split("/");
        return String.format("%02d/%02d/%04d", 
                Integer.parseInt(arr[0]), 
                Integer.parseInt(arr[1]), 
                Integer.parseInt(arr[2]));
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class Danh_sach_doi_tuong_sinh_vien_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        SV[] a = new SV[n];
        for (int i = 0; i < n; i++) {
            a[i] = new SV(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine().trim()));
        }

        Arrays.sort(a, (x, y) -> Double.compare(y.gpa, x.gpa));

        for (SV x : a) {
            System.out.println(x);
        }
        sc.close();
    }
}