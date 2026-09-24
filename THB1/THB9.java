import java.util.*;
import java.io.*;

class SV{
    public String msv, hoten, lop, email, sdt;

    public SV(String msv, String hoten, String lop, String email, String sdt){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String toString(){
        return this.msv + " " + this.hoten + " " + this.lop + " " + this.email + " " + this.sdt;
    }
}

public class THB9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        SV[] a = new SV[10000];
        int cnt = 0;

        while(sc.hasNextLine()){
            a[cnt] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ++cnt;
        }

        Arrays.sort(a, 0, cnt, new Comparator <SV>(){
            public int compare(SV a, SV b){
                if(a.lop.equals(b.lop)){
                    return a.msv.compareTo(b.msv);
                }
                else{
                    return a.lop.compareTo(b.lop);
                }
            }
        });

        for(int i = 0; i < cnt; i++){
            System.out.println(a[i]);
        }
    }
}
