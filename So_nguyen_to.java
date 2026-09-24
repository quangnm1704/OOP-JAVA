import java.util.*;

public class So_nguyen_to {
    public static boolean nto(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while(q-- > 0){
            long n = sc.nextLong();
            if(nto(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
