import java.util.*;

public class Boi_so_nho_nhat_n_so_nguyen_dau_tien {

    public static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }

    public static long lcm(long a, long b){
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            long ans = 1;

            for(int i = 1; i <= n; i++){
                ans = lcm(i, ans);
            }

            System.out.println(ans);
        }
    }
}
