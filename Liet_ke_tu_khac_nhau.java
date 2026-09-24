import java.util.*;
import java.io.*;

public class Liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));

        TreeSet <String> words = new TreeSet<>();
        
        while(sc.hasNext()){
            String token = sc.next();
            words.add(token.toLowerCase());
        }

        for(String x : words) System.out.println(x);
    }
}
