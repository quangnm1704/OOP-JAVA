import java.util.*;
import java.math.*;

public class So_chinh_phuong {
    public static boolean check(long n){
        long t = (long)Math.sqrt(n);

        return t * t == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
