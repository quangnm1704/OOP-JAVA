import java.util.*;
import java.math.*;

class ps{
    private long tu;
    private long mau;

    public ps(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b){
        while(b != 0){
            long r = a%b;
            a = b;
            b = r;
        }

        return a;
    }

    
    public void rutgon(){
        long g = gcd(this.tu, this.mau);
        this.tu /= g;
        this.mau /= g;
    }

    public ps cong(ps p){
        long tuMoi = this.tu * p.mau + p.tu * this.mau;
        long mauMoi = this.mau * p.mau;

        ps res = new ps(tuMoi, mauMoi);
        res.rutgon();
        return res;

    }

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}


public class KT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ps a = new ps(sc.nextLong(), sc.nextLong());
        ps b = new ps(sc.nextLong(), sc.nextLong());

        ps tong = a.cong(b);
        System.out.println(tong);
    }
}
