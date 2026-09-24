import java.util.*;
import java.math.*;

public class Mang_doi_xung {
    public static boolean check(long a[], int n){
        int l = 0, r = n - 1;
        while(l <= r){
            if(a[l] != a[r]) return false;
            ++l;
            --r;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            if(check(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
