import java.util.*;
import java.io.*;
import danhsachsinhvien1.SinhVien;

public class Danh_sach_sinh_vien_trong_file_nhi_phan {
    public static void main(String[] args) throws Exception {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> list = (ArrayList<SinhVien>) o1.readObject();
        o1.close();

        for(SinhVien x : list){
            System.out.println(x);
        }
    }
}
