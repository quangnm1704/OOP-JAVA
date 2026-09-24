import java.util.*;
import java.io.*;
import java.math.*;

class SV{
    public String ten;
    public long dung, sub;

    public SV(String ten, long dung, long sub){
        this.ten = ten;
        this.dung = dung;
        this.sub = sub;
    }

    public String toString(){
        return ten + " " + dung + " " + sub;
    }
}

public class KT02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));

        int n = Integer.parseInt(sc.nextLine());
        List <SV> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();

            String[] num = sc.nextLine().trim().split("\\s+");
            long dung = Long.parseLong(num[0]);
            long sub = Long.parseLong(num[1]);

            list.add(new SV(ten, dung, sub));
        }

        Collections.sort(list, (a, b) ->{
            if(a.dung != b.dung){
                return Long.compare(b.dung, a.dung);
            }

            if(a.sub != b.sub){
                return Long.compare(a.sub, b.sub);
            }

            return a.ten.compareTo(b.ten);
        });

        for(SV x : list) System.out.println(x);
    }
}
