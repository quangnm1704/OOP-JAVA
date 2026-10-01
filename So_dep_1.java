import java.util.*;

public class So_dep_1 {
    public static boolean check1(String s){
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 == 1) return false;
        }

        return true;
    }

    public static boolean check2(String s){
        StringBuilder t = new StringBuilder(s);
        if(t.reverse().toString().equals(s)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            if(check1(s) && check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
