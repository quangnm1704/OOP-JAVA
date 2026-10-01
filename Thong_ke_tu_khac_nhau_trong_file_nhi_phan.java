import java.util.*;
import java.io.*;

public class Thong_ke_tu_khac_nhau_trong_file_nhi_phan {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        HashMap <String, Integer> map = new HashMap<>();
        for(String x : list){

            String[] a = x.trim().toLowerCase().split("[^0-9a-z]+");
            for(String word : a){
                if(!word.isEmpty()){
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        ArrayList <Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());

        list2.sort((a, b) ->{
            if(a.getValue() > b.getValue()) return -1;
            else if(a.getValue() < b.getValue()) return 1;
            else return a.getKey().compareTo(b.getKey());
        });

        for(Map.Entry<String, Integer> x : list2){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}
