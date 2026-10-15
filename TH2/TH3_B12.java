import java.util.*;
import java.io.*;

class GV{
    String ten;
    double gio;
    GV(String ten){
        this.ten = ten;
    }
}

public class TH3_B12 {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int n = sc1.nextInt();
        List<GV> list = new ArrayList<>();
        Map<String, GV> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String ma = sc1.next();
            GV g = new GV(sc1.nextLine().trim());
            list.add(g);
            map.put(ma, g);
        }

        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int m = sc2.nextInt();
        while(m-- > 0){
            String ma = sc2.next();
            sc2.next();
            map.get(ma).gio += Double.parseDouble(sc2.next());
        }

        for(GV g : list){
            System.out.printf(Locale.US, "%s %.2f\n", g.ten, g.gio);
        }
    }
}
