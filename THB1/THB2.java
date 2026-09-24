import java.util.*;

public class THB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];


        double min_val = 10.0, max_val = 0.0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
            if(a[i] < min_val) min_val = a[i];
            if(a[i] > max_val) max_val = a[i];
        }

        double sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(a[i] != min_val && a[i] != max_val){
                sum += a[i];
                cnt++;
            }
        }

        System.out.printf("%.2f\n", sum / cnt);
    }
}
