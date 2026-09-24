import java.util.*;

public class Tinh_luy_thua {
    public static final int mod = (int)1e9 + 7;


    public static long binpow(long a, long b){
        if(b == 0) return 1;
        long x = binpow(a, b/2);

        if(b%2 == 0) return (x%mod*x%mod)%mod;
        else return (x%mod*x%mod*a%mod)%mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);

            if(a == 0 && b == 0) break;
            else{
                System.out.println(binpow(a, b));
            }
        }

        sc.close();
    }
}
