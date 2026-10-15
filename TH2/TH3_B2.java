import java.util.*;
import java.io.*;

public class TH3_B2 {
    public static boolean tn(int n){
        String s = n + "";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return sb.toString().equals(s);
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList <Integer> list = (ArrayList<Integer>) o.readObject();
        o.close();

        TreeSet <Integer> set = new TreeSet<>();
        for(int x : list){
            if(tn(x) && x >= 100){
                set.add(x);
            }
        }

        for(int x : set) System.out.println(x);
    }
}
