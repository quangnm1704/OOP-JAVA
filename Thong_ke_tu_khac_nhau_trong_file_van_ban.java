import java.io.*;
import java.util.*;

public class Thong_ke_tu_khac_nhau_trong_file_van_ban {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        //Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        HashMap <String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] a = s.trim().toLowerCase().split("[^a-z0-9]+");

            for(String w : a){
                if(!w.isEmpty()){
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) ->{
            if(a.getValue() > b.getValue()){
                return -1;
            }

            else if(a.getValue() < b.getValue()) return 1;

            else{
                return a.getKey().compareTo(b.getKey());
            }
        });

        for(Map.Entry <String, Integer> x : list){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}

