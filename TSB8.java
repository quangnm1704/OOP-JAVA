import java.util.*;

public class TSB8 {
    public static long tong(long n){
        long sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            Long[] a = new Long[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a, new comparator <Long>(){

            });
        }
    }
}
