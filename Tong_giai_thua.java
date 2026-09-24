import java.util.*;

public class Tong_giai_thua {
    public static Long gt(int n){
        if(n == 0) return (long)1;
        else return n * gt(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += gt(i);
        }

        System.out.println(sum);

    }
}
