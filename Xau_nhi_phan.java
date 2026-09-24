import java.util.*;

public class Xau_nhi_phan {
    public static long F[] = new long[95];

    public static void init(){
        F[1] = 1;
        F[2] = 1;

        for(int i = 3; i <= 92; i++){
            F[i] = F[i - 2] + F[i - 1];
        }
    }

    public static void solve(long n, long k){
        if(n == 1){
            System.out.println("0");
            return;
        }
        if(n == 2){
            System.out.println("1");
            return;
        }

        if(k <= F[(int)n-2]){
            solve(n-2, k);
        }

        else{
            solve(n-1, k - F[(int)n-2]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();

        int q = sc.nextInt();
        while(q-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            solve(n, k);
        }
    }
}
