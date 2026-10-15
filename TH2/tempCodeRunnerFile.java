
import java.util.*;
import java.io.*;

public class TH3_B3{
    public static boolean check(int n){
        while(n >= 10){
            int s1 = n%10;
            n /= 10;
            int s2 = n%10;
            if(s2 < s1) return false;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        TreeMap <Integer, Integer> map1 = new TreeMap<>();
        for(int x : list1){
            if(x >= 100 && check(x)) map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        TreeMap <Integer, Integer> map2 = new TreeMap<>();
        for(int x : list2){
            if(x >= 100 && check(x)) map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry <Integer, Integer> x : map1.entrySet()){
            if(map2.containsKey(x.getKey())){
                System.out.println(x + " " +  x.getValue() + " " +  map2.get(x.getKey()));
            }
        }

    }
}