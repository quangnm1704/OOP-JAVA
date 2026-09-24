import java.util.*;

public class Liet_ke_to_hop1 {
    static int n, k, cnt;
    static int[] x = new int[100];

    public static void Try(int i){
        for(int j = x[i-1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                ++cnt;
                for(int t = 1; t <= k; t++){
                    System.out.print(x[t] + " ");
                }
                System.out.println();
            }

            else Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
