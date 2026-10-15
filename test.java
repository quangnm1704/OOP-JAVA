import java.util.*;
import java.io.*;

public class test {
    public static boolean tn(int n){
        String s = n + "";
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList <Integer> list = (ArrayList<Integer>) o1.readObject();
        o1.close();

        TreeSet <Integer> set = new TreeSet<>();


        for(int x : list){
            if(tn(x) && x >= 100) set.add(x);
        }

        for(int x : set) System.out.println(x);
    }
}
