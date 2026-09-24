import java.util.*;

class SV{
    String msv, ten, lop, ns;
    double gpa;

    public SV(int id, String ten, String lop, String ns, double gpa){
        this.msv = String.format("B20DCCN%03d", id+1);
        this.ten = chuanhoaTen(ten);
        this.lop = lop;
        this.ns = chuanhoaNS(ns);
        this.gpa = gpa;
    }

    private String chuanhoaTen(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

    private String chuanhoaNS(String s){
        String[] arr = s.trim().split("/");
        return String.format("%02d/%02d/%04d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }

    public String toString(){
        return msv + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class Danh_sach_doi_tuong_SV_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];

        for(int i = 0; i < n; i++){
            a[i] = new SV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }

        for(SV x : a) System.out.println(x);

    }
}
