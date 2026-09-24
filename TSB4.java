import java.math.BigInteger;
import java.util.Scanner;

public class TSB4 {

    public static void solve(BigInteger n) {
        BigInteger THIRTEEN = BigInteger.valueOf(13);

        if (n.mod(THIRTEEN).equals(BigInteger.ZERO)) {
            System.out.println(n);
            return;
        }

        boolean found = false;

        for (int step = 1; step <= 1000; step++) {
            String revStr = new StringBuilder(n.toString()).reverse().toString();
            BigInteger rev = new BigInteger(revStr);

            n = n.add(rev);

            if (n.mod(THIRTEEN).equals(BigInteger.ZERO)) {
                System.out.println(n);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                BigInteger n = sc.nextBigInteger();
                solve(n);
            }
        }

        sc.close();
    }
}