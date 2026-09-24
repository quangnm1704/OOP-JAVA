import java.util.*;

public class So_tam_phan {
    public static boolean solve(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            if(solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
