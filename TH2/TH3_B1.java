package TH2;

import java.util.*;
import java.io.*;

public class TH3_B1 {
    static boolean[] p = new boolean[1000005];
    public static void sieve(){
        Arrays.fill(p, true);
        p[0] = false;
        p[1] = false;
        for(int i = 2; i*i <= 1000000; i++){
            if(p[i]){
                for(int j = i*i; j <= 1000000; j+=i){
                    p[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sieve();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList <Integer> list = (ArrayList<Integer>) o.readObject();
        o.close();

        int[] count = new int[1000005];
        for(int x : list){
            if(x >= 100 && x <= 1000000 && p[x]){
                count[x] = 1;
            }
        }

        for(int i = 100; i <= 1000000; i++){
            if(count[i] == 1){
                System.out.println(i);
            }
        }
    }
}
