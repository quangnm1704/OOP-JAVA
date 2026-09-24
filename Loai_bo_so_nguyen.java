import java.util.*;
import java.io.*;

public class Loai_bo_so_nguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList <String> list = new ArrayList<>();

        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
            }

            catch(NumberFormatException e){
                list.add(s);
            }
        }

        list.sort((a, b) -> a.compareTo(b));
        for(String x : list) System.out.print(x + " ");
    }
}
