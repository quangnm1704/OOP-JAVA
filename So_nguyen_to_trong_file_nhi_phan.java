import java.io.*;
import java.math.*;
import java.util.*;

public class So_nguyen_to_trong_file_nhi_phan {
    public static boolean nto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();

        TreeMap <Integer, Integer> map = new TreeMap<>();
        for(int x : list){
            if(nto(x)){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        
    }
}
