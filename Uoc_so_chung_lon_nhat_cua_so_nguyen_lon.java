import java.util.*;
import java.math.*;

public class Uoc_so_chung_lon_nhat_cua_so_nguyen_lon {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        else{
            return gcd(b, a.mod(b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();

            BigInteger b1 = new BigInteger(num1);
            BigInteger b2 = new BigInteger(num2);

            System.out.println(gcd(b1, b2));
        }

    }
}
