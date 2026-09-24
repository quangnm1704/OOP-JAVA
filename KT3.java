import java.util.*;
import java.math.*;

class PhanSo{
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public void rutgon(){
        long g = gcd(this.tu, this.mau);
        this.tu /= g;
        this.mau /= g;

        if(this.mau < 0){
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    public PhanSo cong(PhanSo p){
        long t = this.tu * p.mau + p.tu*this.mau;
        long m = this.mau * p.mau;
        PhanSo res = new PhanSo(t, m);
        res.rutgon();
        return res;

    }

    public PhanSo nhan(PhanSo p){
        long t = this.tu * p.tu;
        long m = this.mau * p.mau;
        PhanSo res = new PhanSo(t, m);
        res.rutgon();
        return res;
    }

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}


public class KT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());

            PhanSo sum = a.cong(b);
            PhanSo c = sum.nhan(sum);
            PhanSo d = a.nhan(b).nhan(c);

            System.out.println(c + " " + d);
        }
        
    }
}
