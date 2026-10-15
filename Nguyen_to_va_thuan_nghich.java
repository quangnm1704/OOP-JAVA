import java.io.*;
import java.math.*;
import java.util.*;

public class Nguyen_to_va_thuan_nghich {
    static boolean[] p = new boolean[10005];

    public static void sieve(){
        for(int i = 0; i < 10005; i++) p[i] = true;
        p[0] = false;
        p[1] = false;

        for(int i = 2; i <= Math.sqrt(10005); i++){
            for(int j = i*i; j < 10005; j += i){
                p[j] = false;
            }
        }
    }

    public static boolean tn(int n) {
        int rev = 0, m = n;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        sieve();

        TreeMap <Integer, Integer> map1 = new TreeMap<>();
        for(int x : list1){
            if(p[x] && tn(x)){
                map1.put(x, map1.getOrDefault(x, 0) + 1);
            }
        }

        TreeMap <Integer, Integer> map2 = new TreeMap<>();
        for(int x : list2){
            if(p[x] && tn(x)){
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
