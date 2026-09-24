import java.util.*;
import java.math.*;


public class KT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set <BigInteger> set = new HashSet<>();
        
        String s = sc.nextLine();
        String[] a = s.split("\\s+");

        for(int i = 0; i < a.length; i++){
            set.add(new BigInteger(a[i]));
        }

        BigInteger sum = new BigInteger("0");
        BigInteger tich = new BigInteger("1");

        for(BigInteger x : set){
            sum = sum.add(x);
            tich = tich.multiply(x);
        }

        System.out.println(sum);
        System.out.println(tich);


        sc.close();
    }
}
