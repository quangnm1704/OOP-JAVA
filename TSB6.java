import java.util.*;

public class TSB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet <Long> set1 = new TreeSet<>();
        TreeSet <Long> set2 = new TreeSet<>();

        for(int i = 0; i < n; i++){
            long tmp = sc.nextLong();
            set1.add(tmp);
        }

        for(int i = 0; i < m; i++){
            long tmp = sc.nextLong();
            set2.add(tmp);
        }

        set1.retainAll(set2);
        for(long x : set1) System.out.print(x + " ");
        
    }
}
