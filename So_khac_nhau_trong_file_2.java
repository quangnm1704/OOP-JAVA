import java.util.*;
import java.io.*;

public class So_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));

        TreeMap <Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < 100000; i++){
            int n = sc.readInt();

            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }

            else{
                map.put(n, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
