import java.math.BigInteger;
import java.util.*;

public class TSB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);

        System.out.println(s2.add(s1));

        
    }
}
