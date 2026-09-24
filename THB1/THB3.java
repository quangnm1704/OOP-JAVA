import java.util.*;
import java.io.*;

public class THB3 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        for(String s : list){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '0' || c == '1'){
                    sb.append(c);
                }
            }

            if(sb.length() > 0){
                long val = Long.parseLong(sb.toString(), 2);
                System.out.println(sb.toString() + " " + val);
            }
        }
               
    }
}
