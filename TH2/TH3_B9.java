import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

class KH implements Comparable<KH>{
    String id, ten, dc, sp;
    long tien;
    LocalDate het;

    public KH(int i, String ten, String dc, String sp, long tien, String date, long han){
        this.id = String.format("KH%02d", i);
        this.ten = ten;
        this.dc = dc;
        this.sp = sp;
        this.tien = tien;
        this.het = LocalDate.parse(date, DateTimeFormatter.ofPattern("d/M/yyyy")).plusMonths(han);

    }

    public int compareTo(KH o){
        return het.equals(o.het) ? id.compareTo(o.id) : het.compareTo(o.het);
    }

    public String toString(){
        return id + ' ' + ten + " " + dc + " " + sp + " " + tien + " " + het.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

public class TH3_B9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, long[]> sp = new HashMap<>();

        for(int i = 0; i < n; i++){
            String ma = sc.nextLine().trim();
            sc.nextLine();
            long gia = Long.parseLong(sc.nextLine().trim());
            long han = Long.parseLong(sc.nextLine().trim());
            sp.put(ma, new long[]{gia, han});
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        ArrayList <KH> list = new ArrayList<>();

        for(int i = 1; i <= m; i++){
            String ten = sc.nextLine().trim();
            String dc = sc.nextLine().trim();
            String ma = sc.nextLine().trim();
            Long sl = Long.parseLong(sc.nextLine().trim());
            String date = sc.nextLine().trim();
            list.add(new KH(i, ten, dc, ma, sl * sp.get(ma)[0], date, sp.get(ma)[1]));
        }

        Collections.sort(list);
        for(KH x : list){
            System.out.println(x);
        }
    }
}
