import java.io.*;
import java.math.*;
import java.util.*;

public class So_nguyen_to_trong_hai_file_nhi_phan {

    public static boolean nto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        TreeMap <Integer, Integer> map1 = new TreeMap<>();
        for(int x : list1){
            if(nto(x)){
                map1.put(x, map1.getOrDefault(x, 0) + 1);
            }
        }

        TreeMap <Integer, Integer> map2 = new TreeMap<>();
        for(int x : list2){
            if(nto(x)){
                map2.put(x, map2.getOrDefault(x, 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> x : map1.entrySet()){
            if(map2.containsKey(x.getKey())){
                System.out.println(x.getKey() + " " + x.getValue() + " " + map2.get(x.getKey()));
            }
        }

    }
}
