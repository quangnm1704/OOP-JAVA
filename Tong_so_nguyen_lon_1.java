import java.util.*;
import java.math.*;

public class Tong_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){

            BigInteger b1 = sc.nextBigInteger();
            BigInteger b2 = sc.nextBigInteger();

            System.out.println(b1.add(b2));
        }
    }
}

