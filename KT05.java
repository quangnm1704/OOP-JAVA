import java.util.*;
import java.math.*;
import java.io.*;

public class KT05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));

        int n = sc.nextInt();
        BigInteger sodau = sc.nextBigInteger();
        BigInteger maxval = sodau;
        BigInteger minval = sodau;
        BigInteger sum = sodau;

        for(int i = 1; i < n; i++){
            BigInteger x = sc.nextBigInteger();
            minval = minval.min(x);
            maxval = maxval.max(x);
            sum = sum.add(x);
        }

        System.out.println(minval);
        System.out.println(maxval);
        System.out.println(sum);

        sc.close();
    }

}
