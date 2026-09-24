import java.util.*;
import java.io.*;

class KH{
    public String ten, gt, ns1, dc, ma, ns2;

    public KH(String ten, String gt, String ns, String dc){
        this.ten = chuanHoaTen(ten);
        this.gt = gt;
        this.ns1 = chuanHoaNS(ns);
        this.ns2 = chuanHoaNS_nguoc(ns);
        this.dc = dc;
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

    private String chuanHoaNS_nguoc(String s){
        String[] arr = s.split("/");
        String ns = String.format("%04d/%02d/%02d", Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
        return ns.toString();      
    }

    public String toString(){
        return ma + " " + ten + " " + gt + " " + dc + " " + ns1 ;
    }
}


public class Danh_sach_khach_hang_trong_file {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        int n = Integer.parseInt(sc.nextLine());

        KH[] a = new KH[n];

        for(int i = 0; i < n; i++){
            a[i] = new KH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a[i].ma = String.format("KH%03d", i+1);
        }

        Arrays.sort(a, new Comparator<KH>(){
            public int compare(KH a, KH b){
                if(a.ns2.compareTo(b.ns2) < 0) return -1;
                else return 1;
            }
        });

        for(KH x : a) System.out.println(x);

        sc.close();

    }
}
