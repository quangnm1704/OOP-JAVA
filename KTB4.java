import java.util.*;
import java.io.*;

public class KTB4 {
    public static boolean isValid(String s){
        boolean hasDigit = false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '.' || c == ',' || c == '!' || c == '?' || c == ':'){
                return false;
            }

            if(c >= '0' && c <= '9'){
                hasDigit = true;
            }
        }
        return hasDigit;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet <String> set = new TreeSet<>();
        while (sc.hasNext()){
            String s = sc.next();
            if(isValid(s)){
                set.add(s);
            }
        }

        for(String s : set){
            System.out.println(s);
        }
    }
}
