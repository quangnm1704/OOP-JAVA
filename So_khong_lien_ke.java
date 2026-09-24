import java.util.*;

public class So_khong_lien_ke {
    public static boolean tong(long n){
        long sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        return sum % 10 == 0;
    }

    public static boolean check(long n){
        String s = n + "";
        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-- > 0){
            long n = sc.nextLong();
            if(tong(n) && check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
