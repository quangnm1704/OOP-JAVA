import java.math.BigInteger;
import java.util.*;

public class TSB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();
        
        while(q-- > 0){
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();

           BigInteger a = new BigInteger(s1);
           BigInteger b = new BigInteger(s2);
           
           System.out.println(a.gcd(b));
        }
    }
}
