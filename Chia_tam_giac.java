import java.util.*;

public class Chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();

            for(int i = 1; i < n; i++){
                double res = h * Math.sqrt((double)i / n);
                System.out.printf("%.6f" + " ", res);
            }

            System.out.println();
        }

        sc.close();
    }
}
