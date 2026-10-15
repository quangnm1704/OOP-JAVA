import java.util.*;
import java.io.*;

class Hang{
    public String ma, ten, nhom;
    public double giaMua, giaBan, loiNhuan;

    public Hang(int id, String ten, String nhom, double giaMua, double giaBan){
        this.ma = String.format("MH%02d", id);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.loiNhuan);
    }
}

public class Sap_xep_mat_hang {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MATHANG.in"));

        int n = Integer.parseInt(sc.nextLine());
        List <Hang> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new Hang(i+1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        list.sort((a, b) ->{
            if(a.loiNhuan < b.loiNhuan) return 1;
            else return -1;
        });

        for(Hang x : list) System.out.println(x);
    }
}
