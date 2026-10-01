import java.io.*;
import java.util.*;

public class Cac_so_nguyen_khac_nhau_trong_file_nhi_phan {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        TreeSet<Integer> set = new TreeSet<>();

        for (String line : list) {
            String[] words = line.trim().split("\\s+");
            for (String w : words) {
                try {
                    int val = Integer.parseInt(w);
                    set.add(val);
                } catch (NumberFormatException e) {
                }
            }
        }

        for (int x : set) {
            System.out.println(x);
        }
    }
}