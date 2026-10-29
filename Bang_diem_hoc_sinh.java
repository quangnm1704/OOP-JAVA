import java.util.*;

    class hs{
        public String ten, xepLoai, ma;
        public Double toan, tv, ngoaiNgu, vly, hoaHoc, sinh, su, dia, cd, cn, tong;

        public hs(int id, String ten, double toan, double tv, double ngoaiNgu, double vly, double hoaHoc, double sinh, double su, double dia, double cd, double cn){
            this.ten = ten;
            this.toan = toan;
            this.tv = tv;
            this.ngoaiNgu = ngoaiNgu;
            this.vly = vly;
            this.hoaHoc = hoaHoc;
            this.sinh = sinh;
            this.su = su;
            this.dia = dia;
            this.cd = cd;
            this.cn = cn;

            Double sum = (this.toan * 2 +  this.tv * 2 + this.ngoaiNgu + this.vly + this.hoaHoc + this.sinh + this.su + 
            this.dia + this.cd + this.cn) / 12;
            
            this.tong = Math.round(sum * 10.0) / 10.0;


            if(this.tong >= 9) this.xepLoai = "XUAT SAC";
            else if(this.tong >= 8) this.xepLoai = "GIOI";
            else if(this.tong >= 7) this.xepLoai = "KHA";
            else if(this.tong >= 5) this.xepLoai = "TB";
            else this.xepLoai = "YEU";

            this.ma = String.format("HS%02d", id+1);
            
        }

        public String toString(){
            return this.ma + " " + this.ten + " " + String.format("%.1f", this.tong) + " " + this.xepLoai;
        }

    }

public class Bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        hs[] a = new hs[n];

        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String diem = sc.nextLine();
            String[] arr = diem.trim().split("\\s+");
            a[i] = new hs(i, ten, Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5]), Double.parseDouble(arr[6]), Double.parseDouble(arr[7]), Double.parseDouble(arr[8]), Double.parseDouble(arr[9]));
        }

        Arrays.sort(a, (hs x, hs y) -> {
        if (Double.compare(y.tong, x.tong) != 0) {
            return Double.compare(y.tong, x.tong);
        }
        return x.ma.compareTo(y.ma);
    });

    for(hs x : a) System.out.println(x);

    }
}
