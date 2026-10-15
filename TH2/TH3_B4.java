import java.util.*;
import java.io.*;

public class TH3_B4 {


    public static boolean check(int n){
        if(n < 10) return false;
        int last = n%10;
        n /= 10;
        while(n > 0){
            int cur = n%10;
            if(cur > last) return false;
            last = cur;
            n /= 10;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList <Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList <Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        int[] cnt1 = new int[10005];
        int[] cnt2 = new int[10005];

        for(int x : list1){
            if(x >= 10 && x <= 9999){
                cnt1[x]++;
            }
        }

        for(int x : list2){
            if(x >= 10 && x <= 9999){
                cnt2[x]++;
            }
        }

        for(int i = 10; i <= 9999; i++){
            if(cnt1[i] > 0 && cnt2[i] > 0 && check(i)){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
