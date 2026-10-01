import java.util.*;

public class So_dep_2 {

    public static boolean check1(String s){
        StringBuilder t = new StringBuilder(s);
        if(t.reverse().toString().equals(s)) return true;
        else return false;
    }

    public static boolean check2(String s){
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        else{
            long sum = 0;
            for(Character x : s.toCharArray()){
                sum += x - '0';
            }

            return sum % 10 == 0;
        }
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
