import java.util.*;

public class Phan_tich_thua_so_nguyen_to {
    public static void tsnt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int mu = 0;
                while(n % i == 0){
                    ++mu;
                    n /= i;
                }
                System.out.print(i + "(" + mu + ") ");
            }
        }

        if(n > 1) System.out.print(n + "(1" + ") ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int cnt = 1;

        while(q-- > 0){
            int n = sc.nextInt();
            System.out.print("Test " + cnt + ": ");
            ++cnt;
            tsnt(n);

            System.out.println();
        }
    }
}
