import java.util.*;
import java.math.*;

class PhanSo{
    private long tu;
    private long mau;

    public PhanSo(long a, long b){
        this.tu = a;
        this.mau = b;
    }

    public long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }

    public void solve(){
        long g = gcd(this.tu, this.mau);
        this.tu /= g;
        this.mau /= g;
    }

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}

public class Phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        a.solve();
        System.out.println(a);
    }
}
