import java.io.*;
import java.util.*;
import java.io.*;

public class So_nguyen_to_lon_nhat_trong_file {
    public static boolean nto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int x : list1){
            if(nto(x)){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        ArrayList <Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map.entrySet());

        list2.sort((a, b) ->{
            if(a.getKey() > b.getKey()) return -1;
            else return 1;
        });

        for(int i = 0; i < 10; i++){
            System.out.println(list2.get(i).getKey() + " " + list2.get(i).getValue());
        }

    }
}
