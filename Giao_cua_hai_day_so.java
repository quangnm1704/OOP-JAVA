import java.util.*;
import java.math.*;

public class Giao_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet <Integer> s1 = new TreeSet<>();
        TreeSet <Integer> s2 = new TreeSet<>();

        for(int i = 0; i < n; i++) s1.add(sc.nextInt());
        for(int i = 0; i < m; i++) s2.add(sc.nextInt());

        s1.retainAll(s2);

        for(int x : s1) System.out.print(x + " ");
    }
}
