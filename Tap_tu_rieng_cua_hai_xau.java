import java.util.*;

public class Tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a1 = s1.trim().split("\\s+");
            String[] a2 = s2.trim().split("\\s+");

            HashSet <String> set1 = new HashSet<>(Arrays.asList(a1));
            HashSet <String> set2 = new HashSet<>(Arrays.asList(a2));

            set1.removeAll(set2);
            for(String x : set1) System.out.print(x + " ");
            System.out.println();
        }
    }
}
