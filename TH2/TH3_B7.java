import java.util.*;
import java.io.*;
import java.text.*;

class Phim implements Comparable<Phim>{
    String ma, theloai, ten;
    Date ngay;
    int sotap;

    public Phim(int id, String theloai, String ngayStr, String ten, int sotap) throws Exception{
        this.ma = String.format("P%03d", id);
        this.theloai = theloai;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngay = sdf.parse(ngayStr);
        this.ten = ten;
        this.sotap = sotap;
    }

    public int compareTo(Phim o){
        if(!this.ngay.equals(o.ngay)){
            return this.ngay.compareTo(o.ngay);
        }
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        if(this.sotap != o.sotap){
            return Integer.compare(o.sotap, this.sotap);
        }
        return this.ma.compareTo(o.ma);
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + theloai + " " + sdf.format(ngay) + " " + ten + " " + sotap;
    }
}

public class TH3_B7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, String> mapTL = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String maTL = String.format("TL%03d", i);
            String tenTL = sc.nextLine().trim();
            mapTL.put(maTL, tenTL);
        }

        ArrayList <Phim> list = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String line = sc.nextLine().trim();
            while(line.isEmpty()){
                line = sc.nextLine().trim();
            }

            String maTL, ngayStr, tenPhim;
            int soTap;

            String[] tokens = line.split("\\s+");
            if(tokens.length >= 4 && tokens[1] .contains("/")){
                maTL = tokens[0];
                ngayStr = tokens[1];
                soTap = Integer.parseInt(tokens[tokens.length - 1]);
                int idxNgay = line.indexOf(ngayStr);
                String rest = line.substring(idxNgay + ngayStr.length()).trim();
                int  lastSpace = rest.lastIndexOf(' ');
                tenPhim = rest.substring(0, lastSpace).trim();
            }
            else{
                maTL = line;
                ngayStr = sc.nextLine().trim();
                while(ngayStr.isEmpty()) ngayStr = sc.nextLine().trim();
                tenPhim = sc.nextLine().trim();
                while(tenPhim.isEmpty()) tenPhim = sc.nextLine().trim();
                String tapStr = sc.nextLine().trim();
                while(tapStr.isEmpty()) tapStr = sc.nextLine().trim();
                soTap = Integer.parseInt(tapStr);
            }

            list.add(new Phim(i, mapTL.get(maTL), ngayStr, tenPhim, soTap));
        }

        Collections.sort(list);
        for(Phim p : list){
            System.out.println(p);
        }
    }
}
