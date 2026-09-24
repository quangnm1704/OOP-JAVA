import java.util.*;

class NhanVien{
    private String mnv, ten, gt, ns, dc, mst, hd;

    public NhanVien(String ten, String gt, String ns, String dc, String mst, String hd){
        this.mnv = "00001";
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    public String toString(){
        return mnv + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }
}

public class Khai_bao_lop_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a);
    }
}
