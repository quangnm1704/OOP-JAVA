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

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}


public class KT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        ps p = new ps(a, b);
        p.rutgon();
        System.out.println(p);

    }
}
