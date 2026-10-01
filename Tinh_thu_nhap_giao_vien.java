import java.util.*;


public class Tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma = sc.nextLine();
        String hoten = sc.nextLine();
        int luong = sc.nextInt();
        int BacLuong = Integer.parseInt(ma.substring(2));
        int PhuCap = 0;

        if(ma.substring(0, 2).equals("HT")) PhuCap = 2000000;
        else if(ma.substring(0, 2).equals("HP")) PhuCap = 900000;
        else PhuCap = 500000;
        luong *= BacLuong;
        luong += PhuCap;

        System.out.println(ma + " " + hoten + " " + BacLuong + " " + PhuCap + " " + luong);
        
    }
}
