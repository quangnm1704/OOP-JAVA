import java.util.Scanner;
public class Uoc_so_nguyen_to_lon_nhat {
    public static long factor(long n){
        long res = 0;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                res = Math.max(res, (long)i);
                while(n%i == 0){
                    n /= i;
                }
            }
        }

        if(n > 1) res = Math.max(res, n);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q-- > 0){
            long n = sc.nextLong();
            System.out.println(factor(n));
        }

    }
}
