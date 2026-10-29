import java.util.*;
import java.io.*;

class SV{
    String msv;
    String hoTen;
    String sdt;
    public SV(String msv, String hoTen, String sdt) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }
    
}

class BT{
    String tenBT;
    int ttNhom;

    public BT(String tenBT, int ttNhom) {

        this.tenBT = tenBT;
        this.ttNhom = ttNhom;
    }
}

class nhom{
    String maNhom;
    int ttNhom;
    SV sv;
    BT bt;

    public nhom(SV sv, BT bt) {
        this.sv = sv;
        this.bt = bt;
    }

    public String toString(){
        return sv.msv + " " + sv.hoTen + " " + sv.sdt + " " + bt.ttNhom + " " + bt.tenBT;
    }
}

public class Quan_ly_bai_tap_nhom {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        HashMap <String, SV> mapSV = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());

        for(int i = 0; i < n; i++){
            String msv = sc1.nextLine();
            String hoTen = sc1.nextLine();
            String sdt = sc1.nextLine();
            mapSV.put(msv, new SV(msv, hoTen, sdt));
        }
        sc1.close();

        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        HashMap <Integer, BT> mapBT = new HashMap<>();
        int m = Integer.parseInt(sc2.nextLine());

        for(int i = 1; i <= m; i++){
            String tenBT = sc2.nextLine();
            mapBT.put(i, new BT(tenBT, i));
        }
        sc2.close();

        Scanner sc3 = new Scanner(new File("NHOM.in"));
        List <nhom> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            String msv = sc3.next();
            int ttBT = Integer.parseInt(sc3.next());
            nhom group = new nhom(mapSV.get(msv), mapBT.get(ttBT));
            
            list.add(group);
        }
        sc3.close();

        list.sort((a, b) ->{
            return a.sv.msv.compareTo(b.sv.msv);
        });

        for(nhom x : list){
            System.out.println(x);
        }
    }
}

