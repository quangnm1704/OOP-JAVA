import java.util.*;

public class Hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet <Integer> s1 = new TreeSet<>();
        for(int i = 0; i < n+m; i++){
            s1.add(sc.nextInt());
        }

        for(int x : s1) System.out.print(x + " ");
    }
}
