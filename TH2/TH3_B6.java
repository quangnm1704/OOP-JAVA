import java.util.*;
import java.io.*;

public class TH3_B6 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList <String> list1 = (ArrayList<String>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList <Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        TreeSet <String> set1 = new TreeSet<>(list1);
        TreeSet <Integer> set2 = new TreeSet<>(list2);

        for(String s : set1){
            for(int n : set2){
                System.out.println(s + n);
            }
        }

    }
}
