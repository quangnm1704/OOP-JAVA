import java.util.*;

public class TSB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet <Long> set = new TreeSet<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            long tmp = sc.nextLong();
            set.add(tmp);
        }

        for(long x : set) System.out.print(x + " ");
    }
}
