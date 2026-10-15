import java.util.*;
import java.io.*;

class mh{
    public String maMH, ten;
    public int soTC;

    public mh(String maMH, String ten, int soTC){
        this.maMH = maMH;
        this.ten = ten;
        this.soTC = soTC;
    }

    public String toString(){
        return this.maMH + " " + this.ten + " " + this.soTC;
    }
}

public class Danh_sach_mon_hoc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <mh> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            mh h = new mh(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(h);
        }

        list.sort((a, b) ->{
            return a.ten.compareTo(b.ten);
        });

        for(mh x : list) System.out.println(x);
    }
}
