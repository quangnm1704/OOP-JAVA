import java.util.*;

class ThiSinh{
    private String ten;
    private String ns;
    private double d1, d2, d3;

    public ThiSinh(String ten, String ns, double d1, double d2, double d3){
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString(){
        return ten + " " + ns + " " + String.format("%.1f", this.d1 + this.d2 + this.d3);
    }
}

public class Khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println(a);
    }
}
