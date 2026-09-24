import java.util.*;

public class Boi_so_chung_uoc_so_chung {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }

public static long lcm(long a, long b){
    return a * b / gcd(a, b);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
