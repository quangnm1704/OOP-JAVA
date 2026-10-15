import java.util.*;
import java.io.*;

public class So_thuan_nghich_trong_file {

    public static boolean check1(int n){
        String s1 = n + "";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        if(sb.toString().equals(s1.toString())) return true;
        else return false;
    }

    public static boolean check2(int n){
        if(check1(n) == false) return false;

        int cnt = 0;
        while(n > 0){
            if((n%10) % 2 == 0) return false;
            else{
                ++cnt;
                n /= 10;
            }
        }

        return cnt > 1 && cnt % 2 == 1;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        TreeMap <Integer, Integer> map1 = new TreeMap<>();
        TreeMap <Integer, Integer> map2 = new TreeMap<>();

        for(Integer x : list1){
            if(check2(x)){
                map1.put(x, map1.getOrDefault(x, 0) + 1);
            }
        }

        for(Integer x : list2){
            if(check2(x)){
                map2.put(x, map2.getOrDefault(x, 0) + 1);
            }
        }

        int tt = 0;
        for(Map.Entry <Integer, Integer> x : map1.entrySet()){
            if(map2.containsKey(x.getKey())){
                ++tt;
                if(tt <= 10){
                    System.out.println(x.getKey() + " " + (x.getValue() + map2.get(x.getKey())));
                }
            }
        }

    }
}
