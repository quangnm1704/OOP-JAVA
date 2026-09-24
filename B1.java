import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while(q-- > 0){
            long n = sc.nextInt();
            long sum = n * (n+1) / 2;
            System.out.println(sum);
        }

    }
}