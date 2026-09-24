import java.util.*;

public class Tinh_so_fibo {

    static long[] fibo = new long[93];

    public static void initFibo(){
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 2; i < 93; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        initFibo();
        while(q-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo[n-1]);
        }

    }
}
