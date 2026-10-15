import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            BigInteger b1 = sc.nextBigInteger();
            BigInteger eleven = new BigInteger("11");
            if(b1.mod(eleven).equals(BigInteger.ZERO)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
