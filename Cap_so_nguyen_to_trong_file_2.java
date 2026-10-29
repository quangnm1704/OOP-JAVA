import java.util.*;
import java.io.*;

public class Cap_so_nguyen_to_trong_file_2 {
    public static boolean nto(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        o1.close();

        ObjectInputStream o2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        o2.close();

        TreeSet<Integer> set1 = new TreeSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        for (int x : set1) {
            if(nto(x)) {
                if (nto(1000000 - x) && set1.contains(1000000 - x) && !set2.contains(1000000 - x) && !set2.contains(x) && (x < 1000000 - x)) {
                    System.out.println(x + " " + (1000000 - x));
                }
            }
        }
    }
}