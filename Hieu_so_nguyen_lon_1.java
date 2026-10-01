import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Hieu_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while (q-- > 0) {
            String num1 = sc.next();
            String num2 = sc.next();

            int maxLength = Math.max(num1.length(), num2.length());

            BigInteger ans = new BigInteger(num1).subtract(new BigInteger(num2)).abs();
            int thieu = maxLength - ans.toString().length();

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < thieu; i++){
                sb.append('0');
            }

            sb.append(ans.toString());
            System.out.println(sb.toString());
        }
        sc.close();
    }
}