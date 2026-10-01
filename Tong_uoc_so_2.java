import java.util.*;
import java.math.*;

public class Tong_uoc_so_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] sumDiv = new int[b+1];

        for(int i = 1; i <= b / 2; i++){
            for(int j = 2 * i; j <= b; j += i){
                sumDiv[j] += i;
            }
        }

        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(sumDiv[i] > i) ++cnt;
        }

        System.out.println(cnt);
    }
}
