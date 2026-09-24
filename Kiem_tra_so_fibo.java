import java.util.*;

public class Kiem_tra_so_fibo {
    static long[] f = new long[93];
    static HashSet <Long> set = new HashSet<>();


    public static void initFibo(){
        f[0] = 0;
        f[1] = 1;
        set.add((long)1);
        set.add((long)0);

        for(int i = 2; i < 93; i++){
            f[i] = f[i-1] + f[i-2];
            set.add(f[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initFibo();

        int q = sc.nextInt();

        while(q-- > 0){
            long n = sc.nextLong();
            if(set.contains(n)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
