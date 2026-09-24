import java.util.*;
import java.math.*;


public class Dem_so_lan_xuat_hien {

    // public static Boolean nto(int n){
    //     if(n < 2) return false;
    //     else{
    //         for(int i = 2; i <= Math.sqrt(n); i++){
    //             if(n%i == 0) return false;
    //         }
    //     }

    //     return true;
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int cnt = 1;

        while(q-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            int min_val = (int)1e9;
            int max_val = -1;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                min_val = Math.min(min_val, a[i]);
                max_val = Math.max(max_val, a[i]);
            }

            int[] d = new int[max_val+5];
            for(int i = 0; i < n; i++){
                d[a[i]] += 1;
            }

            System.out.println("Test " + cnt + ": ");
            ++cnt;

            for(int i = 0; i < n; i++){
                if(d[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + d[a[i]] + " lan");
                    d[a[i]] = 0;
                }
            }
        }
    }
}
