import java.util.*;
import java.math.*;

public class Xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            if(s1.equals(s2)) System.out.println("-1");
            else{
                if(s1.length() > s2.length()) System.out.println(s1.length());
                else System.out.println(s2.length());
            }
        }
    }
}
