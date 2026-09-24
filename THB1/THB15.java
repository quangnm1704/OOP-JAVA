import java.util.*;
import java.io.*;

public class THB15 {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("DANHSACH.IN"));
        Map<String, String> ten = new HashMap<>(), sdt = new HashMap<>();
        while(sc1.hasNextLine()){
            String msv = sc1.nextLine().trim();
            if(msv.isEmpty()) continue;
            ten.put(msv, sc1.nextLine().trim());
            sc1.nextLine();
            sc1.nextLine();
            sdt.put(msv, "0" + sc1.nextLine().trim());
        }

        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        int m = Integer.parseInt(sc2.nextLine().trim());
        List<String[]> list = new ArrayList<>();
        while(m-- > 0){
            String s = sc2.nextLine().trim();
            int idx = s.lastIndexOf(' ');
            String gv = s.substring(0, idx).trim();
            int n = Integer.parseInt(s.substring(idx + 1).trim());
            while(n-- > 0){
                String[] p = sc2.nextLine().trim().split("\\s+", 2);
                list.add(new String[]{p[0], ten.get(p[0]), gv, p[1], sdt.get(p[0])});
            }
        }

        list.sort((a, b) -> a[0].compareTo(b[0]));
        for(String[] x : list){
            System.out.println(String.join(" ", x));
        }

    }
}
