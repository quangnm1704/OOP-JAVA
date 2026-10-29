import java.util.*;
import java.io.*;


public class KTB1 {

    static class Pair <K, V>{
        public K first;
        public V second;
        public Pair(K key, V value){
            first = key;
            second = value;
        }

        public String toString(){
            return "(" + first.toString() + "," + second.toString() + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         int val = sc.nextInt();
        //         if(i < j && val == 1){
        //             list.add(new Pair<>(i, j));
        //         }
        //     }
        // }

        // for(Pair <Integer, Integer> p : list){
        //     System.out.println(p);
        // }

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1;  j <=n; j++){
                int tmp = sc.nextInt();
                if(j > i && tmp == 1){
                    System.out.println(new Pair<Integer, Integer> (i, j));
                }
            }
        }

    }
}
