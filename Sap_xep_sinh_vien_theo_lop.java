import java.util.*;

class SV{
    public String msv, ht, lop, mail;

    public SV(String msv, String ht, String lop, String mail){
        this.msv = msv;
        this.ht = ht;
        this.mail = mail;
        this.lop = lop;
    }

    public String toString(){
        return msv + " " + ht + " " + lop + " " + mail;
    }
}

public class Sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];

        for(int i = 0; i < n; i++){
            a[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(a, new Comparator <SV>(){
            public int compare(SV a, SV b){
                if(a.lop.equals(b.lop)){
                    return a.msv.compareTo(b.msv);
                }

                else{
                    return a.lop.compareTo(b.lop);
                }
            }
        });

        for(SV x : a) System.out.println(x);

    }
}
