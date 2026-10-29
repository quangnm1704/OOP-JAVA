import java.util.*;
import java.io.*;

class MH{
    String maMH, tenMH;
    int soTC;

    public MH(String maMH, String tenMH, int soTC){
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }
}

class SV{
    String msv, hoTen, lop, email;
    public SV(String msv, String hoTen, String lop, String email){
        this.msv = msv;
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoaTen(String s){
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }
}

class BangDiem{
    String msv, maMon;
    double diem;
    SV sv;
    MH mh;
    public BangDiem(SV sv, MH mh, Double diem){
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }

    public String toString(){
        String diemStr = (diem == (int) diem) ? String.format("%d", (int) diem) : String.valueOf(diem);
        return sv.msv + " " + sv.hoTen + " " + sv.lop + " " + diemStr;
    }
}

public class Bang_diem_theo_mon_hoc {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        HashMap <String, SV> mapSV = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());

        for(int i = 1; i <= n; i++){
            String msv = sc1.nextLine();
            String hoten = sc1.nextLine();
            String lop = sc1.nextLine();
            String email = sc1.nextLine();
            mapSV.put(msv, new SV(msv, hoten, lop, email));
        }
        sc1.close();

        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        HashMap <String, MH> mapMH = new HashMap<>();
        int m = Integer.parseInt(sc2.nextLine());

        for(int i = 1; i <= m; i++){
            String maMH = sc2.nextLine();
            String ten = sc2.nextLine();
            int soTC = Integer.parseInt(sc2.nextLine());

            mapMH.put(maMH, new MH(maMH, ten, soTC));
        }
        sc2.close();

        HashMap <String, ArrayList<BangDiem>> dsBD = new HashMap<>();
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc3.nextLine());
        for(int i = 1; i <= t; i++){
            String msv = sc3.next();
            String maMH = sc3.next();
            double diem = Double.parseDouble(sc3.next());

            // dsBD[maMH].add(new BangDiem(mapSV.get(msv), maMH.get(maMH), diem));
            if(!dsBD.containsKey(maMH)){
                dsBD.put(maMH, new ArrayList<>());
            }

            dsBD.get(maMH).add(new BangDiem(mapSV.get(msv), mapMH.get(maMH), diem));
        }


        int q = sc3.nextInt();
        for(int i = 1; i <= q; i++){
            String mon = sc3.next();
            dsBD.get(mon).sort((a, b)->{
                if(a.diem != b.diem){
                    if(a.diem > b.diem) return -1;
                    else return 1;
                }
                else{
                    return a.sv.msv.compareTo(b.sv.msv);
                }
            });

            System.out.println("BANG DIEM MON " + mapMH.get(mon).tenMH + ":");
            for(BangDiem x : dsBD.get(mon)){
                System.out.println(x);
            }
        }
        sc3.close();
    }
}
