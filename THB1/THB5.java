import java.util.*;
import java.io.*;

public class THB5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        Set <String> set = new HashSet<>();
        ArrayList <String> list = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            if(s.isEmpty()) continue;

            String[] a = s.toLowerCase().split("\\s+");
            String name = String.join(" ", a);

            if(set.add(name)){
                list.add(name);
            }
        }

        Map <String, Integer> map = new HashMap<>();
        for(String s : list){
            String[] a = s.split(" ");
            String mail = a[a.length - 1];
            for(int i = 0; i < a.length - 1; i++){
                mail += a[i].charAt(0);
            }

            int cnt = map.getOrDefault(mail, 0) + 1;
            map.put(mail, cnt);

            if(cnt == 1){
                System.out.println(mail + "@ptit.edu.vn");
            }
            else{
                System.out.println(mail + cnt + "@ptit.edu.vn");
            }
        }
        
    }
}
