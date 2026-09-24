import java.util.*;

public class Uoc_so_chia_het_cho_2 {
    public static int cntUoc(long n){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i%2 == 0) ++cnt;
                if((i != n / i) && (n/i % 2 == 0)) ++cnt;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            long n = sc.nextLong();
            System.out.println(cntUoc(n));
        }
    }
}
