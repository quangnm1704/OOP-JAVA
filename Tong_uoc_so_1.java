import java.util.*;

public class Tong_uoc_so_1 {
    static int[] F = new int[2000005];

    public static void init(){
        for(int i = 2; i * i < 2000005; i++){
            if(F[i] == 0){
                for(int j = i * i; j < 2000005; j += i){
                    if(F[j] == 0) F[j] = i;
                }
            }
        }

        for(int i = 2; i < 2000005; i++){
            if(F[i] == 0) F[i] = i;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long sum = 0;
        init();

        while(q-- > 0){
            int n = sc.nextInt();

            while(n > 1){
                sum += F[n];
                n /= F[n];
            }
        }

        System.out.println(sum);

    }
}
