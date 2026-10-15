import java.util.*;
import java.io.*;

class SV{
    String ma, ten, lop, email, sdt, gt;
    public SV(String ma, String ten, String lop, String email, String sdt, String gt){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
    }

    public String toString(){
        return ma + ' ' + ten + " " + lop + " " + email + ' ' + sdt;
    }
}

public class TH3_B10 {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.nextLine().trim());
        ArrayList <SV> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new SV(sc1.nextLine().trim(), sc1.nextLine().trim(), sc1.nextLine().trim(), sc1.nextLine().trim(), sc1.nextLine().trim(), sc1.nextLine().trim()));
        }
        Collections.sort(list, (a, b) -> a.ma.compareTo(b.ma));
        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        Map <String, String> sizeMap = new HashMap<>();
        while(sc2.hasNext()){
            sizeMap.put(sc2.next(), sc2.next());
        }

        Scanner sc3 = new Scanner(new File("TRUYVAN.in"));
        int q = sc3.nextInt();
        while(q-- > 0){
            String gt = sc3.next();
            String size = sc3.next();
            System.out.println("DANH SACH SINH VIEN "  + gt.toUpperCase() + " DANG KY SIZE " + size);
            for(SV s : list){
                if(s.gt.equalsIgnoreCase(gt) && size.equals(sizeMap.get(s.ma))){
                    System.out.println(s);
                }
            }
        }
    }
}
