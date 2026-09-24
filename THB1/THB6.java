import java.util.*;
import java.io.*;

public class THB6 {
    public static boolean check(String s){
        boolean coSo = false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '.' || c == ',' || c == '!' || c == '?' || c == ':'){
                return false;
            }

            if(c >= '0' && c <= '9'){
                coSo = true;
            }
        }
        return coSo;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                set.add(s);
            }
        }

        for(String s : set){
            System.out.println(s);
        }
        
    }
}
