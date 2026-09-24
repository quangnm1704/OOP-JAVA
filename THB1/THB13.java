import java.util.*;
import java.io.*;

class MonHoc{
    String ma, ten, ht;

    MonHoc(String ma, String ten, String ht){
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    public String toString(){
        return ma + " " + ten + " " + ht;
    }
}

public class THB13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList <MonHoc> a = new ArrayList<>();
        HashSet <String> set = new HashSet<>();

        while(sc.hasNextLine()){
            String ma = sc.nextLine().trim();
            if(ma.isEmpty()) continue;
            String ten = sc.nextLine().trim();
            String ht = sc.nextLine().trim();

            if(set.add(ma)){
                a.add(new MonHoc(ma, ten, ht));
            }
        }

        a.sort((x, y) -> x.ma.compareTo(y.ma));

        for(MonHoc x : a){
            System.out.println(x);
        }
    }
}
